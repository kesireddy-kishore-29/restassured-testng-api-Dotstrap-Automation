# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-572e067d-3b14-49e4-8c2d-2d9f400cba23` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-cca6a79a-282c-4a09-8943-60c45f18348e` |
| 3 | `POST /v1/auth/token` | 200 | 51 | `qa-d94fd81d-d732-4b69-89b3-b2671e3c56f5` |
| 4 | `POST /v1/conversations` | 201 | 51 | `qa-e7e69fd0-4d53-4711-b197-ba254250cf0d` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 22 | `qa-07a260a2-008c-4076-956b-728a4847ffc6` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-a32918be-2870-4397-8e0b-92443524a44d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-4ea3f0f0-c021-4a19-87ef-a071b01bf9f2` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-0ba072dd-04ae-44e0-adea-0c42a6ff6aef` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-883cb549-59d9-4bf9-9ff7-fe0f530effc2` |
| 10 | `POST /v1/auth/token` | 401 | 28 | `qa-3bee3b01-1b9d-41a5-816e-694f31f4acb0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-572e067d-3b14-49e4-8c2d-2d9f400cba23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-572e067d-3b14-49e4-8c2d-2d9f400cba23
Content-Type: application/json

--- request body ---
{"handle":"qa-cc905e08c7ec","displayName":"QA cc905e08c7ec","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-572e067d-3b14-49e4-8c2d-2d9f400cba23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 6
Location: /v1/accounts/qa-cc905e08c7ec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1cf37eb7-3c3b-47c6-bad1-36eec4b38ce8","handle":"qa-cc905e08c7ec","displayName":"QA cc905e08c7ec","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.054607794Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cca6a79a-282c-4a09-8943-60c45f18348e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cca6a79a-282c-4a09-8943-60c45f18348e
Content-Type: application/json

--- request body ---
{"handle":"qa-028f1253616e","displayName":"QA 028f1253616e","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-cca6a79a-282c-4a09-8943-60c45f18348e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 6
Location: /v1/accounts/qa-028f1253616e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_53153397-04a5-4272-b2ce-af0673a7393a","handle":"qa-028f1253616e","displayName":"QA 028f1253616e","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.100421652Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d94fd81d-d732-4b69-89b3-b2671e3c56f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d94fd81d-d732-4b69-89b3-b2671e3c56f5
Content-Type: application/json

--- request body ---
{"handle":"qa-cc905e08c7ec","password":"****"}

--- response: 200 in 51 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-d94fd81d-d732-4b69-89b3-b2671e3c56f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1cf37eb7-3c3b-47c6-bad1-36eec4b38ce8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e7e69fd0-4d53-4711-b197-ba254250cf0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7e69fd0-4d53-4711-b197-ba254250cf0d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-028f1253616e","subject":"Error contract","message":"Hi"}

--- response: 201 in 51 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7e69fd0-4d53-4711-b197-ba254250cf0d
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
Location: /v1/conversations/cnv_1d990d12-e23e-4720-ad2f-03f540107797
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1d990d12-e23e-4720-ad2f-03f540107797","subject":"Error contract","status":"open","region":"eu","participants":["qa-cc905e08c7ec","qa-028f1253616e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:34.211096545Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_1d990d12-e23e-4720-ad2f-03f540107797/messages
correlation: qa-07a260a2-008c-4076-956b-728a4847ffc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07a260a2-008c-4076-956b-728a4847ffc6
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-07a260a2-008c-4076-956b-728a4847ffc6
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_1d990d12-e23e-4720-ad2f-03f540107797/messages","correlationId":"qa-07a260a2-008c-4076-956b-728a4847ffc6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a32918be-2870-4397-8e0b-92443524a44d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a32918be-2870-4397-8e0b-92443524a44d
Content-Type: application/json

--- request body ---
{"handle":"qa-028f1253616e","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-a32918be-2870-4397-8e0b-92443524a44d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_53153397-04a5-4272-b2ce-af0673a7393a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4ea3f0f0-c021-4a19-87ef-a071b01bf9f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ea3f0f0-c021-4a19-87ef-a071b01bf9f2
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4ea3f0f0-c021-4a19-87ef-a071b01bf9f2
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
correlation: qa-0ba072dd-04ae-44e0-adea-0c42a6ff6aef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ba072dd-04ae-44e0-adea-0c42a6ff6aef
Content-Type: application/json

--- request body ---
{"handle":"qa-028f1253616e","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0ba072dd-04ae-44e0-adea-0c42a6ff6aef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0ba072dd-04ae-44e0-adea-0c42a6ff6aef"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-883cb549-59d9-4bf9-9ff7-fe0f530effc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-883cb549-59d9-4bf9-9ff7-fe0f530effc2
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-883cb549-59d9-4bf9-9ff7-fe0f530effc2
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
correlation: qa-3bee3b01-1b9d-41a5-816e-694f31f4acb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bee3b01-1b9d-41a5-816e-694f31f4acb0
Content-Type: application/json

--- request body ---
{"handle":"qa-cc905e08c7ec","password":"****"}

--- response: 401 in 28 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3bee3b01-1b9d-41a5-816e-694f31f4acb0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3bee3b01-1b9d-41a5-816e-694f31f4acb0"}
```
