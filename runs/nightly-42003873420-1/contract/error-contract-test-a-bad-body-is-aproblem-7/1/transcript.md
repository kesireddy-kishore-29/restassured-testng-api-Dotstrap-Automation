# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 65 | `qa-6bb783b1-c8b8-4e14-9d19-84ef3c302404` |
| 2 | `POST /v1/accounts` | 201 | 49 | `qa-edf7be0c-2ace-4ad7-8f36-586813ae0d61` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-bf354da7-f615-4ab5-9631-a8586249b65a` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-9b1f1178-b78b-4bdd-9ba7-047bbb59ad63` |
| 5 | `PATCH /v1/accounts/me` | 415 | 19 | `qa-d139e40f-3e8c-43e0-8f8a-78103cc0f794` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-3eec553e-786a-49c0-ac02-8f30022a8214` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-4f065c8f-30b4-4a6e-a4e4-e746867d5f20` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-2b67e34e-3758-47bf-8ac1-e31866ee6534` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-a471d15e-fc62-42eb-a220-5af12420ddb5` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-da4c0619-f961-4384-b24d-fedee30c1d04` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6bb783b1-c8b8-4e14-9d19-84ef3c302404

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bb783b1-c8b8-4e14-9d19-84ef3c302404
Content-Type: application/json

--- request body ---
{"handle":"qa-25fe56cb6b89","displayName":"QA 25fe56cb6b89","password":"****","region":"eu"}

--- response: 201 in 65 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bb783b1-c8b8-4e14-9d19-84ef3c302404
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 7
Location: /v1/accounts/qa-25fe56cb6b89
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9c9aee0b-2bfd-4842-ba65-de3824b9766f","handle":"qa-25fe56cb6b89","displayName":"QA 25fe56cb6b89","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.607224668Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-edf7be0c-2ace-4ad7-8f36-586813ae0d61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edf7be0c-2ace-4ad7-8f36-586813ae0d61
Content-Type: application/json

--- request body ---
{"handle":"qa-4837f3f4f23d","displayName":"QA 4837f3f4f23d","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-edf7be0c-2ace-4ad7-8f36-586813ae0d61
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 7
Location: /v1/accounts/qa-4837f3f4f23d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cc53417-0ae5-47ea-b202-21ab292b6e83","handle":"qa-4837f3f4f23d","displayName":"QA 4837f3f4f23d","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.675307411Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bf354da7-f615-4ab5-9631-a8586249b65a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf354da7-f615-4ab5-9631-a8586249b65a
Content-Type: application/json

--- request body ---
{"handle":"qa-25fe56cb6b89","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf354da7-f615-4ab5-9631-a8586249b65a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9c9aee0b-2bfd-4842-ba65-de3824b9766f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9b1f1178-b78b-4bdd-9ba7-047bbb59ad63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b1f1178-b78b-4bdd-9ba7-047bbb59ad63
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4837f3f4f23d","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b1f1178-b78b-4bdd-9ba7-047bbb59ad63
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
Location: /v1/conversations/cnv_b1e2be2e-bb56-4a45-b018-cdc7d3d7e7d0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b1e2be2e-bb56-4a45-b018-cdc7d3d7e7d0","subject":"Error contract","status":"open","region":"eu","participants":["qa-25fe56cb6b89","qa-4837f3f4f23d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:55.763080054Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-d139e40f-3e8c-43e0-8f8a-78103cc0f794

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d139e40f-3e8c-43e0-8f8a-78103cc0f794
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 19 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d139e40f-3e8c-43e0-8f8a-78103cc0f794
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-d139e40f-3e8c-43e0-8f8a-78103cc0f794"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3eec553e-786a-49c0-ac02-8f30022a8214

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3eec553e-786a-49c0-ac02-8f30022a8214
Content-Type: application/json

--- request body ---
{"handle":"qa-4837f3f4f23d","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-3eec553e-786a-49c0-ac02-8f30022a8214
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4cc53417-0ae5-47ea-b202-21ab292b6e83"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f065c8f-30b4-4a6e-a4e4-e746867d5f20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f065c8f-30b4-4a6e-a4e4-e746867d5f20
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f065c8f-30b4-4a6e-a4e4-e746867d5f20
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
correlation: qa-2b67e34e-3758-47bf-8ac1-e31866ee6534

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b67e34e-3758-47bf-8ac1-e31866ee6534
Content-Type: application/json

--- request body ---
{"handle":"qa-4837f3f4f23d","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b67e34e-3758-47bf-8ac1-e31866ee6534
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2b67e34e-3758-47bf-8ac1-e31866ee6534"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a471d15e-fc62-42eb-a220-5af12420ddb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a471d15e-fc62-42eb-a220-5af12420ddb5
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a471d15e-fc62-42eb-a220-5af12420ddb5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-da4c0619-f961-4384-b24d-fedee30c1d04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da4c0619-f961-4384-b24d-fedee30c1d04
Content-Type: application/json

--- request body ---
{"handle":"qa-25fe56cb6b89","password":"****"}

--- response: 401 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da4c0619-f961-4384-b24d-fedee30c1d04
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-da4c0619-f961-4384-b24d-fedee30c1d04"}
```
