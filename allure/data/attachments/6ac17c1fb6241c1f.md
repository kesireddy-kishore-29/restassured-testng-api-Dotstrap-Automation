# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 47 | `qa-cd58e999-62e3-4443-8371-6298658d8079` |
| 2 | `POST /v1/accounts` | 201 | 60 | `qa-604a576c-7db5-4fbb-a832-cb9d03b06d9b` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-395c6c25-16bf-47b6-9b9b-e0172529c85a` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-4961e371-e712-4642-addd-628d82fb9bdd` |
| 5 | `POST /v1/accounts` | 422 | 6 | `qa-46a0dec4-e6e7-4350-b545-afa3b8b788b8` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-073e0028-3101-41dd-ad8b-e8fa0fcdc833` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-c37ac776-ee84-4d0e-8721-4b7e50c7232f` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-82466c74-ba45-472f-be42-e94cdcaf549c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-2db6284c-8c21-4523-a00e-2ecae3e3937a` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-4c38c5a5-00f7-4d86-a34e-9dc6cec2c886` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cd58e999-62e3-4443-8371-6298658d8079

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd58e999-62e3-4443-8371-6298658d8079
Content-Type: application/json

--- request body ---
{"handle":"qa-c48f8016676d","displayName":"QA c48f8016676d","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd58e999-62e3-4443-8371-6298658d8079
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 8
Location: /v1/accounts/qa-c48f8016676d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e50e3ee5-caeb-430a-ab1e-27d86c4477c9","handle":"qa-c48f8016676d","displayName":"QA c48f8016676d","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.218926382Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-604a576c-7db5-4fbb-a832-cb9d03b06d9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-604a576c-7db5-4fbb-a832-cb9d03b06d9b
Content-Type: application/json

--- request body ---
{"handle":"qa-cbafbe38960b","displayName":"QA cbafbe38960b","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-604a576c-7db5-4fbb-a832-cb9d03b06d9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 8
Location: /v1/accounts/qa-cbafbe38960b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_07c98660-822c-45c6-87b2-7f1f1bebcb5f","handle":"qa-cbafbe38960b","displayName":"QA cbafbe38960b","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.293939747Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-395c6c25-16bf-47b6-9b9b-e0172529c85a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-395c6c25-16bf-47b6-9b9b-e0172529c85a
Content-Type: application/json

--- request body ---
{"handle":"qa-c48f8016676d","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-395c6c25-16bf-47b6-9b9b-e0172529c85a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e50e3ee5-caeb-430a-ab1e-27d86c4477c9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4961e371-e712-4642-addd-628d82fb9bdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4961e371-e712-4642-addd-628d82fb9bdd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cbafbe38960b","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-4961e371-e712-4642-addd-628d82fb9bdd
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
Location: /v1/conversations/cnv_938b9c8a-bd5b-450b-8ade-d951dc70f124
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_938b9c8a-bd5b-450b-8ade-d951dc70f124","subject":"Error contract","status":"open","region":"eu","participants":["qa-c48f8016676d","qa-cbafbe38960b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:24.428020880Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-46a0dec4-e6e7-4350-b545-afa3b8b788b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46a0dec4-e6e7-4350-b545-afa3b8b788b8
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46a0dec4-e6e7-4350-b545-afa3b8b788b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 7
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-46a0dec4-e6e7-4350-b545-afa3b8b788b8","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-073e0028-3101-41dd-ad8b-e8fa0fcdc833

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-073e0028-3101-41dd-ad8b-e8fa0fcdc833
Content-Type: application/json

--- request body ---
{"handle":"qa-cbafbe38960b","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-073e0028-3101-41dd-ad8b-e8fa0fcdc833
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_07c98660-822c-45c6-87b2-7f1f1bebcb5f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c37ac776-ee84-4d0e-8721-4b7e50c7232f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c37ac776-ee84-4d0e-8721-4b7e50c7232f
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c37ac776-ee84-4d0e-8721-4b7e50c7232f
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
correlation: qa-82466c74-ba45-472f-be42-e94cdcaf549c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82466c74-ba45-472f-be42-e94cdcaf549c
Content-Type: application/json

--- request body ---
{"handle":"qa-cbafbe38960b","password":"****"}

--- response: 401 in 22 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-82466c74-ba45-472f-be42-e94cdcaf549c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-82466c74-ba45-472f-be42-e94cdcaf549c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2db6284c-8c21-4523-a00e-2ecae3e3937a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2db6284c-8c21-4523-a00e-2ecae3e3937a
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2db6284c-8c21-4523-a00e-2ecae3e3937a
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
correlation: qa-4c38c5a5-00f7-4d86-a34e-9dc6cec2c886

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c38c5a5-00f7-4d86-a34e-9dc6cec2c886
Content-Type: application/json

--- request body ---
{"handle":"qa-c48f8016676d","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c38c5a5-00f7-4d86-a34e-9dc6cec2c886
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4c38c5a5-00f7-4d86-a34e-9dc6cec2c886"}
```
