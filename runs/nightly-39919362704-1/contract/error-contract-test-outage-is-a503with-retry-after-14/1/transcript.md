# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-43253d2c-83f8-4973-af74-092e1c039733` |
| 2 | `POST /v1/accounts` | 201 | 66 | `qa-aca7dd47-5f65-46e7-8aab-24ea1f6d1a75` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-9ab76482-6f1f-44d4-84ca-931606bacbc5` |
| 4 | `POST /v1/conversations` | 201 | 29 | `qa-087881e0-ce8e-48c5-b3ba-094464558366` |
| 5 | `GET /v1/credits/ledger` | 503 | 24 | `qa-cfd1f643-cb5d-49ec-a068-0adda51af264` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-9d50daa6-82ad-40ef-8c60-0e41a38f92ce` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-83ec6407-1171-4185-9936-ac5c6424c6f9` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-f2ae225b-0cb4-4bf6-bc09-36206a11b010` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-87db04ff-f8dc-4cdd-ae81-665bb956b96d` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-05236af3-d904-4986-bd28-48f99da15e9b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-43253d2c-83f8-4973-af74-092e1c039733

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43253d2c-83f8-4973-af74-092e1c039733
Content-Type: application/json

--- request body ---
{"handle":"qa-e37937c04430","displayName":"QA e37937c04430","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-43253d2c-83f8-4973-af74-092e1c039733
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 6
Location: /v1/accounts/qa-e37937c04430
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bcf21735-ea75-42f3-9681-d41b4d371433","handle":"qa-e37937c04430","displayName":"QA e37937c04430","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.767252628Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-aca7dd47-5f65-46e7-8aab-24ea1f6d1a75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aca7dd47-5f65-46e7-8aab-24ea1f6d1a75
Content-Type: application/json

--- request body ---
{"handle":"qa-dfc03af7d7f8","displayName":"QA dfc03af7d7f8","password":"****","region":"eu"}

--- response: 201 in 66 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-aca7dd47-5f65-46e7-8aab-24ea1f6d1a75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 6
Location: /v1/accounts/qa-dfc03af7d7f8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cca2d361-6207-4c04-80c3-a9ee771adc22","handle":"qa-dfc03af7d7f8","displayName":"QA dfc03af7d7f8","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.834168144Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9ab76482-6f1f-44d4-84ca-931606bacbc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ab76482-6f1f-44d4-84ca-931606bacbc5
Content-Type: application/json

--- request body ---
{"handle":"qa-e37937c04430","password":"****"}

--- response: 200 in 32 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ab76482-6f1f-44d4-84ca-931606bacbc5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bcf21735-ea75-42f3-9681-d41b4d371433"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-087881e0-ce8e-48c5-b3ba-094464558366

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-087881e0-ce8e-48c5-b3ba-094464558366
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dfc03af7d7f8","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-087881e0-ce8e-48c5-b3ba-094464558366
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
Location: /v1/conversations/cnv_bdc15988-1ac7-4b60-b895-640681d2fc37
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bdc15988-1ac7-4b60-b895-640681d2fc37","subject":"Error contract","status":"open","region":"eu","participants":["qa-e37937c04430","qa-dfc03af7d7f8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:46.949126978Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-cfd1f643-cb5d-49ec-a068-0adda51af264

--- request headers ---
Accept: application/json
X-Fault-Key: 7ae340f3-a510-4bb9-90ad-7d7d253860ef
X-Fault: unavailable-once
X-Correlation-Id: qa-cfd1f643-cb5d-49ec-a068-0adda51af264
Content-Type: application/json

--- response: 503 in 24 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cfd1f643-cb5d-49ec-a068-0adda51af264
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-cfd1f643-cb5d-49ec-a068-0adda51af264"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9d50daa6-82ad-40ef-8c60-0e41a38f92ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d50daa6-82ad-40ef-8c60-0e41a38f92ce
Content-Type: application/json

--- request body ---
{"handle":"qa-dfc03af7d7f8","password":"****"}

--- response: 200 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d50daa6-82ad-40ef-8c60-0e41a38f92ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cca2d361-6207-4c04-80c3-a9ee771adc22"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-83ec6407-1171-4185-9936-ac5c6424c6f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83ec6407-1171-4185-9936-ac5c6424c6f9
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-83ec6407-1171-4185-9936-ac5c6424c6f9
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-f2ae225b-0cb4-4bf6-bc09-36206a11b010

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2ae225b-0cb4-4bf6-bc09-36206a11b010
Content-Type: application/json

--- request body ---
{"handle":"qa-dfc03af7d7f8","password":"****"}

--- response: 401 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2ae225b-0cb4-4bf6-bc09-36206a11b010
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f2ae225b-0cb4-4bf6-bc09-36206a11b010"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-87db04ff-f8dc-4cdd-ae81-665bb956b96d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87db04ff-f8dc-4cdd-ae81-665bb956b96d
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-87db04ff-f8dc-4cdd-ae81-665bb956b96d
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
correlation: qa-05236af3-d904-4986-bd28-48f99da15e9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05236af3-d904-4986-bd28-48f99da15e9b
Content-Type: application/json

--- request body ---
{"handle":"qa-e37937c04430","password":"****"}

--- response: 401 in 27 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05236af3-d904-4986-bd28-48f99da15e9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-05236af3-d904-4986-bd28-48f99da15e9b"}
```
