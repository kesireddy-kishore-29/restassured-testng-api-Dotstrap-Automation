# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-3e2de349-fa0e-4ddd-a828-1f169ed04511` |
| 2 | `POST /v1/accounts` | 201 | 71 | `qa-ff58d626-d08b-4441-8ce2-ecc26fab91b0` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-52e88085-030c-44a0-aabb-c14338cbb391` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-42d716ba-8a95-4616-aa5a-67a817506bd5` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 23 | `qa-536fc8a4-c228-4c3d-af52-758733af376f` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-f24348c0-de46-46e9-9a30-049aa21dc2d3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-cdcd52df-6b9e-4314-8017-7ba82c2cba8a` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-ed30eae6-2b3b-4d41-af9c-1e978979ed75` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-bd765320-797f-414e-a979-a8e8fd24a141` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-cc287c85-1022-4d91-ac25-a5d509740efc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3e2de349-fa0e-4ddd-a828-1f169ed04511

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e2de349-fa0e-4ddd-a828-1f169ed04511
Content-Type: application/json

--- request body ---
{"handle":"qa-62c6d51e2be2","displayName":"QA 62c6d51e2be2","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e2de349-fa0e-4ddd-a828-1f169ed04511
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 9
Location: /v1/accounts/qa-62c6d51e2be2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2a37091c-bd6f-4961-a9e1-0b7c8957a2b1","handle":"qa-62c6d51e2be2","displayName":"QA 62c6d51e2be2","region":"eu","role":"user","createdAt":"2026-11-23T10:54:58.815885648Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ff58d626-d08b-4441-8ce2-ecc26fab91b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff58d626-d08b-4441-8ce2-ecc26fab91b0
Content-Type: application/json

--- request body ---
{"handle":"qa-79169c4861bf","displayName":"QA 79169c4861bf","password":"****","region":"eu"}

--- response: 201 in 71 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff58d626-d08b-4441-8ce2-ecc26fab91b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 8
Location: /v1/accounts/qa-79169c4861bf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49cb25b5-1fb4-432f-a69b-d2b019f908fe","handle":"qa-79169c4861bf","displayName":"QA 79169c4861bf","region":"eu","role":"user","createdAt":"2026-11-23T10:54:58.900996661Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-52e88085-030c-44a0-aabb-c14338cbb391

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52e88085-030c-44a0-aabb-c14338cbb391
Content-Type: application/json

--- request body ---
{"handle":"qa-62c6d51e2be2","password":"****"}

--- response: 200 in 25 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-52e88085-030c-44a0-aabb-c14338cbb391
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2a37091c-bd6f-4961-a9e1-0b7c8957a2b1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-42d716ba-8a95-4616-aa5a-67a817506bd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42d716ba-8a95-4616-aa5a-67a817506bd5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-79169c4861bf","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-42d716ba-8a95-4616-aa5a-67a817506bd5
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
Location: /v1/conversations/cnv_85d6e834-731f-4a98-89d0-1ba4ce902922
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_85d6e834-731f-4a98-89d0-1ba4ce902922","subject":"Error contract","status":"open","region":"eu","participants":["qa-62c6d51e2be2","qa-79169c4861bf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:58.976003312Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-62c6d51e2be2
correlation: qa-536fc8a4-c228-4c3d-af52-758733af376f

--- request headers ---
Accept: application/json
X-Fault-Key: 3e700f5a-3989-481b-a36e-e649d59e9c80
X-Fault: unavailable-once
X-Correlation-Id: qa-536fc8a4-c228-4c3d-af52-758733af376f
Content-Type: application/json

--- response: 503 in 23 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-536fc8a4-c228-4c3d-af52-758733af376f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-62c6d51e2be2","correlationId":"qa-536fc8a4-c228-4c3d-af52-758733af376f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f24348c0-de46-46e9-9a30-049aa21dc2d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f24348c0-de46-46e9-9a30-049aa21dc2d3
Content-Type: application/json

--- request body ---
{"handle":"qa-79169c4861bf","password":"****"}

--- response: 200 in 23 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f24348c0-de46-46e9-9a30-049aa21dc2d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_49cb25b5-1fb4-432f-a69b-d2b019f908fe"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cdcd52df-6b9e-4314-8017-7ba82c2cba8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdcd52df-6b9e-4314-8017-7ba82c2cba8a
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cdcd52df-6b9e-4314-8017-7ba82c2cba8a
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
correlation: qa-ed30eae6-2b3b-4d41-af9c-1e978979ed75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed30eae6-2b3b-4d41-af9c-1e978979ed75
Content-Type: application/json

--- request body ---
{"handle":"qa-79169c4861bf","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed30eae6-2b3b-4d41-af9c-1e978979ed75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ed30eae6-2b3b-4d41-af9c-1e978979ed75"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bd765320-797f-414e-a979-a8e8fd24a141

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd765320-797f-414e-a979-a8e8fd24a141
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bd765320-797f-414e-a979-a8e8fd24a141
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
correlation: qa-cc287c85-1022-4d91-ac25-a5d509740efc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc287c85-1022-4d91-ac25-a5d509740efc
Content-Type: application/json

--- request body ---
{"handle":"qa-62c6d51e2be2","password":"****"}

--- response: 401 in 17 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc287c85-1022-4d91-ac25-a5d509740efc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cc287c85-1022-4d91-ac25-a5d509740efc"}
```
