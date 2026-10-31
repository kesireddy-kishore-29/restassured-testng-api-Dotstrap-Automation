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
| 1 | `POST /v1/accounts` | 201 | 8 | `qa-e85b5327-c900-469c-b18d-d9ae4f7c32b4` |
| 2 | `POST /v1/accounts` | 201 | 6 | `qa-71cddc38-beee-4583-8534-1e90496648d5` |
| 3 | `POST /v1/auth/token` | 200 | 7 | `qa-22e92866-c179-4ecf-8109-fbbe4e7868ec` |
| 4 | `POST /v1/credits/purchases` | 201 | 4 | `qa-a6008e56-7831-447d-be8d-35f27f4f0d14` |
| 5 | `POST /v1/auth/token` | 200 | 5 | `qa-fb977b55-cfe5-4a28-b670-07bbc1269590` |
| 6 | `POST /v1/credits/purchases` | 201 | 3 | `qa-3a951a02-ffe9-4390-8207-c679378bc040` |
| 7 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-f25fadee-1781-4209-8e31-0d5d4ba351a1` |
| 8 | `POST /v1/auth/token` | 401 | 3 | `qa-e1747353-63de-4aec-bfe1-2f556a1b3ddf` |
| 9 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-ad7b4918-8376-4cc8-9eeb-6ef8a9b1a453` |
| 10 | `POST /v1/auth/token` | 401 | 2 | `qa-2b073936-cad6-4b88-a6b0-c0dee7316868` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e85b5327-c900-469c-b18d-d9ae4f7c32b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e85b5327-c900-469c-b18d-d9ae4f7c32b4
Content-Type: application/json

--- request body ---
{"handle":"qa-4443a6609c62","displayName":"QA 4443a6609c62","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-e85b5327-c900-469c-b18d-d9ae4f7c32b4
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
Location: /v1/accounts/qa-4443a6609c62
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2d4a7500-bd46-44a3-a441-c06b6da0fca0","handle":"qa-4443a6609c62","displayName":"QA 4443a6609c62","region":"eu","role":"user","createdAt":"2026-10-27T08:00:20.086473214Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-71cddc38-beee-4583-8534-1e90496648d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71cddc38-beee-4583-8534-1e90496648d5
Content-Type: application/json

--- request body ---
{"handle":"qa-8de0cc3e5fbd","displayName":"QA 8de0cc3e5fbd","password":"****","region":"us"}

--- response: 201 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-71cddc38-beee-4583-8534-1e90496648d5
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
Location: /v1/accounts/qa-8de0cc3e5fbd
X-Served-Region: us
Content-Length: 181

{"id":"acc_323a9f57-c9cc-4774-85d6-af95fe34a905","handle":"qa-8de0cc3e5fbd","displayName":"QA 8de0cc3e5fbd","region":"us","role":"user","createdAt":"2026-10-27T08:00:20.097982530Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-22e92866-c179-4ecf-8109-fbbe4e7868ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22e92866-c179-4ecf-8109-fbbe4e7868ec
Content-Type: application/json

--- request body ---
{"handle":"qa-4443a6609c62","password":"****"}

--- response: 200 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-22e92866-c179-4ecf-8109-fbbe4e7868ec
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2d4a7500-bd46-44a3-a441-c06b6da0fca0"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a6008e56-7831-447d-be8d-35f27f4f0d14

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3c10fd1ede234ee3ab632f5568b53c3c
X-Correlation-Id: qa-a6008e56-7831-447d-be8d-35f27f4f0d14
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6008e56-7831-447d-be8d-35f27f4f0d14
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
Location: /v1/credits/purchases/pur_f627e697-8895-48c7-819a-651813ca0c64
Content-Length: 144

{"id":"pur_f627e697-8895-48c7-819a-651813ca0c64","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-27T08:00:20.118412862Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-fb977b55-cfe5-4a28-b670-07bbc1269590

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb977b55-cfe5-4a28-b670-07bbc1269590
Content-Type: application/json

--- request body ---
{"handle":"qa-8de0cc3e5fbd","password":"****"}

--- response: 200 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb977b55-cfe5-4a28-b670-07bbc1269590
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_323a9f57-c9cc-4774-85d6-af95fe34a905"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3a951a02-ffe9-4390-8207-c679378bc040

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3c10fd1ede234ee3ab632f5568b53c3c
X-Correlation-Id: qa-3a951a02-ffe9-4390-8207-c679378bc040
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a951a02-ffe9-4390-8207-c679378bc040
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
Location: /v1/credits/purchases/pur_327c891d-e53c-48b2-b033-5035c3a16988
Content-Length: 144

{"id":"pur_327c891d-e53c-48b2-b033-5035c3a16988","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-27T08:00:20.135017970Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f25fadee-1781-4209-8e31-0d5d4ba351a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f25fadee-1781-4209-8e31-0d5d4ba351a1
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f25fadee-1781-4209-8e31-0d5d4ba351a1
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
correlation: qa-e1747353-63de-4aec-bfe1-2f556a1b3ddf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1747353-63de-4aec-bfe1-2f556a1b3ddf
Content-Type: application/json

--- request body ---
{"handle":"qa-8de0cc3e5fbd","password":"****"}

--- response: 401 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1747353-63de-4aec-bfe1-2f556a1b3ddf
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e1747353-63de-4aec-bfe1-2f556a1b3ddf"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ad7b4918-8376-4cc8-9eeb-6ef8a9b1a453

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad7b4918-8376-4cc8-9eeb-6ef8a9b1a453
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ad7b4918-8376-4cc8-9eeb-6ef8a9b1a453
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
correlation: qa-2b073936-cad6-4b88-a6b0-c0dee7316868

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b073936-cad6-4b88-a6b0-c0dee7316868
Content-Type: application/json

--- request body ---
{"handle":"qa-4443a6609c62","password":"****"}

--- response: 401 in 2 ms ---
Date: Tue, 27 Oct 2026 08:00:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b073936-cad6-4b88-a6b0-c0dee7316868
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2b073936-cad6-4b88-a6b0-c0dee7316868"}
```
