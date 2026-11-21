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
| 1 | `POST /v1/accounts` | 201 | 456 | `qa-f375dbd4-45e0-4ec6-af1f-e46564999908` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-ff43c415-5f01-45b0-b301-95c1b69d52a7` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-caf3c0a0-42c2-458c-b755-f84c33625571` |
| 4 | `POST /v1/credits/purchases` | 201 | 48 | `qa-f079053d-b1da-47d8-867f-b7068608ef6d` |
| 5 | `POST /v1/auth/token` | 200 | 32 | `qa-6b9e47c0-2ba9-4166-bcca-7d18b15f9438` |
| 6 | `POST /v1/credits/purchases` | 201 | 14 | `qa-9c38c96b-6654-4387-a79c-4eae19bbf23e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-f7084431-00be-4a5c-85d8-ab20e1785e71` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-54d118c9-9660-4312-beef-75a1aa780886` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-f07d82da-3e58-47d5-9a28-9e0088a03d31` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-fdaefa54-f424-4c9f-8e6b-ac0e5d2ebacc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f375dbd4-45e0-4ec6-af1f-e46564999908

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f375dbd4-45e0-4ec6-af1f-e46564999908
Content-Type: application/json

--- request body ---
{"handle":"qa-cb0114503063","displayName":"QA cb0114503063","password":"****","region":"eu"}

--- response: 201 in 456 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-f375dbd4-45e0-4ec6-af1f-e46564999908
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-cb0114503063
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d946f6ee-a16a-40e9-8b5b-6ce8dd9bc44d","handle":"qa-cb0114503063","displayName":"QA cb0114503063","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.131128176Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ff43c415-5f01-45b0-b301-95c1b69d52a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff43c415-5f01-45b0-b301-95c1b69d52a7
Content-Type: application/json

--- request body ---
{"handle":"qa-dad8e205cd11","displayName":"QA dad8e205cd11","password":"****","region":"us"}

--- response: 201 in 46 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff43c415-5f01-45b0-b301-95c1b69d52a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-dad8e205cd11
X-Served-Region: us
Content-Length: 181

{"id":"acc_537c3efd-03bf-4362-a58b-1a9938d51785","handle":"qa-dad8e205cd11","displayName":"QA dad8e205cd11","region":"us","role":"user","createdAt":"2026-11-17T10:50:17.523617095Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-caf3c0a0-42c2-458c-b755-f84c33625571

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-caf3c0a0-42c2-458c-b755-f84c33625571
Content-Type: application/json

--- request body ---
{"handle":"qa-cb0114503063","password":"****"}

--- response: 200 in 36 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-caf3c0a0-42c2-458c-b755-f84c33625571
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d946f6ee-a16a-40e9-8b5b-6ce8dd9bc44d"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f079053d-b1da-47d8-867f-b7068608ef6d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6adcdd1831b3416daea2f76fd2cbd7f1
X-Correlation-Id: qa-f079053d-b1da-47d8-867f-b7068608ef6d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 48 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-f079053d-b1da-47d8-867f-b7068608ef6d
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
Location: /v1/credits/purchases/pur_4b6f90b3-0872-47d8-9d25-5d5664e4bbcb
Content-Length: 141

{"id":"pur_4b6f90b3-0872-47d8-9d25-5d5664e4bbcb","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-17T10:50:17.674900Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-6b9e47c0-2ba9-4166-bcca-7d18b15f9438

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b9e47c0-2ba9-4166-bcca-7d18b15f9438
Content-Type: application/json

--- request body ---
{"handle":"qa-dad8e205cd11","password":"****"}

--- response: 200 in 32 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b9e47c0-2ba9-4166-bcca-7d18b15f9438
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_537c3efd-03bf-4362-a58b-1a9938d51785"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9c38c96b-6654-4387-a79c-4eae19bbf23e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6adcdd1831b3416daea2f76fd2cbd7f1
X-Correlation-Id: qa-9c38c96b-6654-4387-a79c-4eae19bbf23e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c38c96b-6654-4387-a79c-4eae19bbf23e
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
Location: /v1/credits/purchases/pur_f478c319-b947-41ad-b3b8-ec4d27e0b38e
Content-Length: 144

{"id":"pur_f478c319-b947-41ad-b3b8-ec4d27e0b38e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-17T10:50:17.805921040Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f7084431-00be-4a5c-85d8-ab20e1785e71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7084431-00be-4a5c-85d8-ab20e1785e71
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f7084431-00be-4a5c-85d8-ab20e1785e71
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
correlation: qa-54d118c9-9660-4312-beef-75a1aa780886

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54d118c9-9660-4312-beef-75a1aa780886
Content-Type: application/json

--- request body ---
{"handle":"qa-dad8e205cd11","password":"****"}

--- response: 401 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-54d118c9-9660-4312-beef-75a1aa780886
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-54d118c9-9660-4312-beef-75a1aa780886"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f07d82da-3e58-47d5-9a28-9e0088a03d31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f07d82da-3e58-47d5-9a28-9e0088a03d31
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f07d82da-3e58-47d5-9a28-9e0088a03d31
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
correlation: qa-fdaefa54-f424-4c9f-8e6b-ac0e5d2ebacc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdaefa54-f424-4c9f-8e6b-ac0e5d2ebacc
Content-Type: application/json

--- request body ---
{"handle":"qa-cb0114503063","password":"****"}

--- response: 401 in 19 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fdaefa54-f424-4c9f-8e6b-ac0e5d2ebacc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fdaefa54-f424-4c9f-8e6b-ac0e5d2ebacc"}
```
