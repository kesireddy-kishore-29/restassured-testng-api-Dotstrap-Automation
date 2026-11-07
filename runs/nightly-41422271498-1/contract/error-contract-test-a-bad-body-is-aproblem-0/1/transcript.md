# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 370 | `qa-59cab881-076e-418c-8140-c48449c592ba` |
| 2 | `POST /v1/accounts` | 201 | 56 | `qa-3a2ca66f-8eab-4ff3-9d52-1116c17cb37a` |
| 3 | `POST /v1/auth/token` | 200 | 76 | `qa-682bdd43-7ccc-4afb-97e3-1105619e399f` |
| 4 | `POST /v1/conversations` | 201 | 53 | `qa-5cd7111d-9f7f-4d7b-b287-fd8c8302accc` |
| 5 | `POST /v1/auth/token` | 400 | 12 | `qa-b21e966c-37af-4b26-aa42-7899d6494d93` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-7d697d75-3dfd-4821-843c-09803edde0e6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-ddf0d564-f128-4c00-9e63-a62c675481a2` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-8ad1c9f4-70e1-40bb-b838-c29d7efc2a8d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-0f66c912-ee73-4ac8-8fe9-f128831fbfc6` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-34885eb3-1347-4c16-a3af-ea5ecb4c5d19` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-59cab881-076e-418c-8140-c48449c592ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59cab881-076e-418c-8140-c48449c592ba
Content-Type: application/json

--- request body ---
{"handle":"qa-8321da717b99","displayName":"QA 8321da717b99","password":"****","region":"eu"}

--- response: 201 in 370 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-59cab881-076e-418c-8140-c48449c592ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Location: /v1/accounts/qa-8321da717b99
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2daa9944-ed8b-4ed0-a605-efa7fdd24128","handle":"qa-8321da717b99","displayName":"QA 8321da717b99","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.627012219Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3a2ca66f-8eab-4ff3-9d52-1116c17cb37a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a2ca66f-8eab-4ff3-9d52-1116c17cb37a
Content-Type: application/json

--- request body ---
{"handle":"qa-3b5efd7effe8","displayName":"QA 3b5efd7effe8","password":"****","region":"eu"}

--- response: 201 in 56 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a2ca66f-8eab-4ff3-9d52-1116c17cb37a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Location: /v1/accounts/qa-3b5efd7effe8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_01c6038d-820f-469b-8f55-72995f976cdd","handle":"qa-3b5efd7effe8","displayName":"QA 3b5efd7effe8","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.986331745Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-682bdd43-7ccc-4afb-97e3-1105619e399f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-682bdd43-7ccc-4afb-97e3-1105619e399f
Content-Type: application/json

--- request body ---
{"handle":"qa-8321da717b99","password":"****"}

--- response: 200 in 76 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-682bdd43-7ccc-4afb-97e3-1105619e399f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2daa9944-ed8b-4ed0-a605-efa7fdd24128"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5cd7111d-9f7f-4d7b-b287-fd8c8302accc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cd7111d-9f7f-4d7b-b287-fd8c8302accc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3b5efd7effe8","subject":"Error contract","message":"Hi"}

--- response: 201 in 53 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-5cd7111d-9f7f-4d7b-b287-fd8c8302accc
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
Location: /v1/conversations/cnv_96d513c7-fe2a-4a28-b863-4010a68ba4fb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_96d513c7-fe2a-4a28-b863-4010a68ba4fb","subject":"Error contract","status":"open","region":"eu","participants":["qa-8321da717b99","qa-3b5efd7effe8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:35.183466343Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-b21e966c-37af-4b26-aa42-7899d6494d93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b21e966c-37af-4b26-aa42-7899d6494d93
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b21e966c-37af-4b26-aa42-7899d6494d93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 10
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-b21e966c-37af-4b26-aa42-7899d6494d93"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7d697d75-3dfd-4821-843c-09803edde0e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d697d75-3dfd-4821-843c-09803edde0e6
Content-Type: application/json

--- request body ---
{"handle":"qa-3b5efd7effe8","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d697d75-3dfd-4821-843c-09803edde0e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_01c6038d-820f-469b-8f55-72995f976cdd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ddf0d564-f128-4c00-9e63-a62c675481a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddf0d564-f128-4c00-9e63-a62c675481a2
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ddf0d564-f128-4c00-9e63-a62c675481a2
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
correlation: qa-8ad1c9f4-70e1-40bb-b838-c29d7efc2a8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ad1c9f4-70e1-40bb-b838-c29d7efc2a8d
Content-Type: application/json

--- request body ---
{"handle":"qa-3b5efd7effe8","password":"****"}

--- response: 401 in 28 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ad1c9f4-70e1-40bb-b838-c29d7efc2a8d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8ad1c9f4-70e1-40bb-b838-c29d7efc2a8d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0f66c912-ee73-4ac8-8fe9-f128831fbfc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f66c912-ee73-4ac8-8fe9-f128831fbfc6
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0f66c912-ee73-4ac8-8fe9-f128831fbfc6
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
correlation: qa-34885eb3-1347-4c16-a3af-ea5ecb4c5d19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34885eb3-1347-4c16-a3af-ea5ecb4c5d19
Content-Type: application/json

--- request body ---
{"handle":"qa-8321da717b99","password":"****"}

--- response: 401 in 20 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-34885eb3-1347-4c16-a3af-ea5ecb4c5d19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-34885eb3-1347-4c16-a3af-ea5ecb4c5d19"}
```
