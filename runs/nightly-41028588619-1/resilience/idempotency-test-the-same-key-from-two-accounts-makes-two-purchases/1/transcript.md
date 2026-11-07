# Transcript: Keys are scoped per account

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#theSameKeyFromTwoAccountsMakesTwoPurchases` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 8 | `qa-c59f6dfd-8c5e-4e0b-b189-bc98ae867df3` |
| 2 | `POST /v1/accounts` | 201 | 8 | `qa-8e1124f3-8387-4dc8-a5aa-604dc1cf1a46` |
| 3 | `POST /v1/auth/token` | 200 | 8 | `qa-eeaa7f98-dd53-4514-986f-5a3daa14655f` |
| 4 | `POST /v1/credits/purchases` | 201 | 4 | `qa-001c52d7-759f-4771-a630-8a11c1cb1932` |
| 5 | `POST /v1/auth/token` | 200 | 9 | `qa-afef65ac-b52c-43bc-a52e-ba1e12af258e` |
| 6 | `POST /v1/credits/purchases` | 201 | 5 | `qa-0f9a348d-01f2-4cae-99fe-e63a973af16f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-b27f00b4-d60b-40f5-86f8-7cf880031467` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-e5298c8e-35f7-47e4-a2a5-043b0536a72b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-67261536-0616-4944-a711-32d775ed26f2` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-39c2559a-e066-4c9a-89f2-8876fdd14766` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c59f6dfd-8c5e-4e0b-b189-bc98ae867df3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c59f6dfd-8c5e-4e0b-b189-bc98ae867df3
Content-Type: application/json

--- request body ---
{"handle":"qa-d213f67628db","displayName":"QA d213f67628db","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-c59f6dfd-8c5e-4e0b-b189-bc98ae867df3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-d213f67628db
X-Served-Region: eu
Content-Length: 181

{"id":"acc_074fc6de-6c67-49c6-b984-ee08039b388f","handle":"qa-d213f67628db","displayName":"QA d213f67628db","region":"eu","role":"user","createdAt":"2026-10-30T08:45:49.956657299Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8e1124f3-8387-4dc8-a5aa-604dc1cf1a46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e1124f3-8387-4dc8-a5aa-604dc1cf1a46
Content-Type: application/json

--- request body ---
{"handle":"qa-32c7b426829d","displayName":"QA 32c7b426829d","password":"****","region":"us"}

--- response: 201 in 8 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e1124f3-8387-4dc8-a5aa-604dc1cf1a46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-32c7b426829d
X-Served-Region: us
Content-Length: 181

{"id":"acc_76452a19-331f-4a18-b9a2-fb3ea91027dc","handle":"qa-32c7b426829d","displayName":"QA 32c7b426829d","region":"us","role":"user","createdAt":"2026-10-30T08:45:49.971881301Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-eeaa7f98-dd53-4514-986f-5a3daa14655f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eeaa7f98-dd53-4514-986f-5a3daa14655f
Content-Type: application/json

--- request body ---
{"handle":"qa-d213f67628db","password":"****"}

--- response: 200 in 8 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-eeaa7f98-dd53-4514-986f-5a3daa14655f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_074fc6de-6c67-49c6-b984-ee08039b388f"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-001c52d7-759f-4771-a630-8a11c1cb1932

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3e0b21e5fcdb42c58078fd0c289cdf58
X-Correlation-Id: qa-001c52d7-759f-4771-a630-8a11c1cb1932
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 4 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-001c52d7-759f-4771-a630-8a11c1cb1932
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/credits/purchases/pur_4cccebb1-ab0b-46d2-8969-e4661fb9c5bc
Content-Length: 144

{"id":"pur_4cccebb1-ab0b-46d2-8969-e4661fb9c5bc","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-30T08:45:49.995224844Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-afef65ac-b52c-43bc-a52e-ba1e12af258e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afef65ac-b52c-43bc-a52e-ba1e12af258e
Content-Type: application/json

--- request body ---
{"handle":"qa-32c7b426829d","password":"****"}

--- response: 200 in 9 ms ---
Date: Fri, 30 Oct 2026 08:45:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-afef65ac-b52c-43bc-a52e-ba1e12af258e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_76452a19-331f-4a18-b9a2-fb3ea91027dc"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0f9a348d-01f2-4cae-99fe-e63a973af16f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3e0b21e5fcdb42c58078fd0c289cdf58
X-Correlation-Id: qa-0f9a348d-01f2-4cae-99fe-e63a973af16f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 5 ms ---
Date: Fri, 30 Oct 2026 08:45:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f9a348d-01f2-4cae-99fe-e63a973af16f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Location: /v1/credits/purchases/pur_305dde65-7887-4fa9-abc2-cf22a7c4abca
Content-Length: 144

{"id":"pur_305dde65-7887-4fa9-abc2-cf22a7c4abca","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-30T08:45:50.017612756Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b27f00b4-d60b-40f5-86f8-7cf880031467

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b27f00b4-d60b-40f5-86f8-7cf880031467
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 30 Oct 2026 08:45:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b27f00b4-d60b-40f5-86f8-7cf880031467
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: us
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-e5298c8e-35f7-47e4-a2a5-043b0536a72b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5298c8e-35f7-47e4-a2a5-043b0536a72b
Content-Type: application/json

--- request body ---
{"handle":"qa-32c7b426829d","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 30 Oct 2026 08:45:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5298c8e-35f7-47e4-a2a5-043b0536a72b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e5298c8e-35f7-47e4-a2a5-043b0536a72b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-67261536-0616-4944-a711-32d775ed26f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67261536-0616-4944-a711-32d775ed26f2
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 30 Oct 2026 08:45:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-67261536-0616-4944-a711-32d775ed26f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-39c2559a-e066-4c9a-89f2-8876fdd14766

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39c2559a-e066-4c9a-89f2-8876fdd14766
Content-Type: application/json

--- request body ---
{"handle":"qa-d213f67628db","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 30 Oct 2026 08:45:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39c2559a-e066-4c9a-89f2-8876fdd14766
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-39c2559a-e066-4c9a-89f2-8876fdd14766"}
```
