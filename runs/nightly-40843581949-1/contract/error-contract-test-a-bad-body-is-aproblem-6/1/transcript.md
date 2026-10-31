# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-c4471bb8-8c5a-4b37-bfde-88d7deb34977` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-42d98c0b-fa9b-4021-befa-df58e9b124be` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-a7498429-a351-4f72-9ac7-c2fc14caa11b` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-5da29891-ad1c-4e76-bdd8-e2d3b6c3357e` |
| 5 | `PATCH /v1/accounts/me` | 400 | 25 | `qa-dc88e12a-c057-4a38-a385-9fb882a1a894` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-bb575cd3-499a-4436-9461-67e85c31384b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-e208fb1f-1b1f-4876-8646-8c98986a77ac` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-06269fb1-4e7c-44f9-8f4a-48ad89bf62f0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-2a95a786-5e73-4b47-9b2c-db09b7503b5e` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-cfe5c74c-b2a9-4a30-a0f3-b4ad26392d9a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c4471bb8-8c5a-4b37-bfde-88d7deb34977

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4471bb8-8c5a-4b37-bfde-88d7deb34977
Content-Type: application/json

--- request body ---
{"handle":"qa-1f0bca4ae1d5","displayName":"QA 1f0bca4ae1d5","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4471bb8-8c5a-4b37-bfde-88d7deb34977
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 8
Location: /v1/accounts/qa-1f0bca4ae1d5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_97dd1b7f-39dd-424d-980b-aff6c7aa96f3","handle":"qa-1f0bca4ae1d5","displayName":"QA 1f0bca4ae1d5","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.744807182Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-42d98c0b-fa9b-4021-befa-df58e9b124be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42d98c0b-fa9b-4021-befa-df58e9b124be
Content-Type: application/json

--- request body ---
{"handle":"qa-26f68192b501","displayName":"QA 26f68192b501","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-42d98c0b-fa9b-4021-befa-df58e9b124be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 8
Location: /v1/accounts/qa-26f68192b501
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8dcb9358-50cf-4e1f-a59c-b951ab5bc468","handle":"qa-26f68192b501","displayName":"QA 26f68192b501","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.807198727Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a7498429-a351-4f72-9ac7-c2fc14caa11b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7498429-a351-4f72-9ac7-c2fc14caa11b
Content-Type: application/json

--- request body ---
{"handle":"qa-1f0bca4ae1d5","password":"****"}

--- response: 200 in 34 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7498429-a351-4f72-9ac7-c2fc14caa11b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_97dd1b7f-39dd-424d-980b-aff6c7aa96f3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5da29891-ad1c-4e76-bdd8-e2d3b6c3357e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5da29891-ad1c-4e76-bdd8-e2d3b6c3357e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-26f68192b501","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5da29891-ad1c-4e76-bdd8-e2d3b6c3357e
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
Location: /v1/conversations/cnv_e6e0896e-63b3-4398-ace5-86ad3135fd78
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e6e0896e-63b3-4398-ace5-86ad3135fd78","subject":"Error contract","status":"open","region":"eu","participants":["qa-1f0bca4ae1d5","qa-26f68192b501"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:59.912484867Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-dc88e12a-c057-4a38-a385-9fb882a1a894

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc88e12a-c057-4a38-a385-9fb882a1a894
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 25 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc88e12a-c057-4a38-a385-9fb882a1a894
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-dc88e12a-c057-4a38-a385-9fb882a1a894"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bb575cd3-499a-4436-9461-67e85c31384b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb575cd3-499a-4436-9461-67e85c31384b
Content-Type: application/json

--- request body ---
{"handle":"qa-26f68192b501","password":"****"}

--- response: 200 in 39 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb575cd3-499a-4436-9461-67e85c31384b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8dcb9358-50cf-4e1f-a59c-b951ab5bc468"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e208fb1f-1b1f-4876-8646-8c98986a77ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e208fb1f-1b1f-4876-8646-8c98986a77ac
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e208fb1f-1b1f-4876-8646-8c98986a77ac
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
correlation: qa-06269fb1-4e7c-44f9-8f4a-48ad89bf62f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06269fb1-4e7c-44f9-8f4a-48ad89bf62f0
Content-Type: application/json

--- request body ---
{"handle":"qa-26f68192b501","password":"****"}

--- response: 401 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-06269fb1-4e7c-44f9-8f4a-48ad89bf62f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-06269fb1-4e7c-44f9-8f4a-48ad89bf62f0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2a95a786-5e73-4b47-9b2c-db09b7503b5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a95a786-5e73-4b47-9b2c-db09b7503b5e
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2a95a786-5e73-4b47-9b2c-db09b7503b5e
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
correlation: qa-cfe5c74c-b2a9-4a30-a0f3-b4ad26392d9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfe5c74c-b2a9-4a30-a0f3-b4ad26392d9a
Content-Type: application/json

--- request body ---
{"handle":"qa-1f0bca4ae1d5","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cfe5c74c-b2a9-4a30-a0f3-b4ad26392d9a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cfe5c74c-b2a9-4a30-a0f3-b4ad26392d9a"}
```
