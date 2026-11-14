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
| 1 | `POST /v1/accounts` | 201 | 58 | `qa-b56c8e92-0b67-4293-921a-48692707f675` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-cd433f2f-1de3-46ee-898c-3f363c879bab` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-799d0841-a810-45b4-8d21-d9361e41faf2` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-e3bbe3b3-4638-4260-80fd-3144af80ee95` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 17 | `qa-b2b1aab7-7634-4d87-8ca5-e8869662269b` |
| 6 | `POST /v1/auth/token` | 200 | 50 | `qa-ce289253-2d29-48bd-b8e5-dbdb2a7677d9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 41 | `qa-b23c5d2c-fb4c-438a-8df1-477f9cf0ddf3` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-f769b475-f60b-4f4a-98c3-e72e4c2a32ac` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-e3f0cdaf-bcc7-4cda-8f91-32c5bbfae6af` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-7b9eff31-52d9-4f34-8430-b41b162bd144` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b56c8e92-0b67-4293-921a-48692707f675

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b56c8e92-0b67-4293-921a-48692707f675
Content-Type: application/json

--- request body ---
{"handle":"qa-b89588da6695","displayName":"QA b89588da6695","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-b56c8e92-0b67-4293-921a-48692707f675
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 7
Location: /v1/accounts/qa-b89588da6695
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ea54878c-c376-49d8-b929-7bd3a37fa8a8","handle":"qa-b89588da6695","displayName":"QA b89588da6695","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.202888985Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cd433f2f-1de3-46ee-898c-3f363c879bab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd433f2f-1de3-46ee-898c-3f363c879bab
Content-Type: application/json

--- request body ---
{"handle":"qa-be533622d528","displayName":"QA be533622d528","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd433f2f-1de3-46ee-898c-3f363c879bab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 7
Location: /v1/accounts/qa-be533622d528
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e0d83432-d8e3-4345-9db0-b2e86853ddf7","handle":"qa-be533622d528","displayName":"QA be533622d528","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.252782862Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-799d0841-a810-45b4-8d21-d9361e41faf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-799d0841-a810-45b4-8d21-d9361e41faf2
Content-Type: application/json

--- request body ---
{"handle":"qa-b89588da6695","password":"****"}

--- response: 200 in 28 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-799d0841-a810-45b4-8d21-d9361e41faf2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ea54878c-c376-49d8-b929-7bd3a37fa8a8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e3bbe3b3-4638-4260-80fd-3144af80ee95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3bbe3b3-4638-4260-80fd-3144af80ee95
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-be533622d528","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3bbe3b3-4638-4260-80fd-3144af80ee95
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
Location: /v1/conversations/cnv_9f33ad96-e016-4b92-b306-00934d93e265
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9f33ad96-e016-4b92-b306-00934d93e265","subject":"Error contract","status":"open","region":"eu","participants":["qa-b89588da6695","qa-be533622d528"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:37.314547962Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_9f33ad96-e016-4b92-b306-00934d93e265/messages
correlation: qa-b2b1aab7-7634-4d87-8ca5-e8869662269b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2b1aab7-7634-4d87-8ca5-e8869662269b
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b2b1aab7-7634-4d87-8ca5-e8869662269b
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_9f33ad96-e016-4b92-b306-00934d93e265/messages","correlationId":"qa-b2b1aab7-7634-4d87-8ca5-e8869662269b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ce289253-2d29-48bd-b8e5-dbdb2a7677d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce289253-2d29-48bd-b8e5-dbdb2a7677d9
Content-Type: application/json

--- request body ---
{"handle":"qa-be533622d528","password":"****"}

--- response: 200 in 50 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce289253-2d29-48bd-b8e5-dbdb2a7677d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e0d83432-d8e3-4345-9db0-b2e86853ddf7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b23c5d2c-fb4c-438a-8df1-477f9cf0ddf3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b23c5d2c-fb4c-438a-8df1-477f9cf0ddf3
Content-Type: application/json

--- response: 204 in 41 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b23c5d2c-fb4c-438a-8df1-477f9cf0ddf3
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
correlation: qa-f769b475-f60b-4f4a-98c3-e72e4c2a32ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f769b475-f60b-4f4a-98c3-e72e4c2a32ac
Content-Type: application/json

--- request body ---
{"handle":"qa-be533622d528","password":"****"}

--- response: 401 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f769b475-f60b-4f4a-98c3-e72e4c2a32ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f769b475-f60b-4f4a-98c3-e72e4c2a32ac"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e3f0cdaf-bcc7-4cda-8f91-32c5bbfae6af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3f0cdaf-bcc7-4cda-8f91-32c5bbfae6af
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e3f0cdaf-bcc7-4cda-8f91-32c5bbfae6af
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
correlation: qa-7b9eff31-52d9-4f34-8430-b41b162bd144

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b9eff31-52d9-4f34-8430-b41b162bd144
Content-Type: application/json

--- request body ---
{"handle":"qa-b89588da6695","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b9eff31-52d9-4f34-8430-b41b162bd144
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7b9eff31-52d9-4f34-8430-b41b162bd144"}
```
