# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-7978946e-5305-4e1b-bfcf-1503286b93d8` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-19f311d3-0fec-46ae-87b4-43832645fe49` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-98a80442-0430-4719-8273-8256ee1382d9` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-dd143ba1-e74c-4dcb-b1ac-09760250cf19` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 30 | `qa-0882da17-ede2-4ad4-b130-35460b7f9a5c` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-df375366-0cbe-4a54-a0a4-cd5288c5b854` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-bdc9c6f4-c802-4004-b35d-2a5ca82ebf76` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-9d5d04c3-547e-4eb2-9cfd-0b4243f618bd` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-6e93759b-ca63-4e31-a011-33bf83e587ab` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-d2206440-d7f3-4443-aac1-977d55369855` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7978946e-5305-4e1b-bfcf-1503286b93d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7978946e-5305-4e1b-bfcf-1503286b93d8
Content-Type: application/json

--- request body ---
{"handle":"qa-f8c841e81385","displayName":"QA f8c841e81385","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-7978946e-5305-4e1b-bfcf-1503286b93d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 7
Location: /v1/accounts/qa-f8c841e81385
X-Served-Region: eu
Content-Length: 181

{"id":"acc_414db564-1ae1-4326-9b93-f467788b272b","handle":"qa-f8c841e81385","displayName":"QA f8c841e81385","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.766210119Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-19f311d3-0fec-46ae-87b4-43832645fe49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19f311d3-0fec-46ae-87b4-43832645fe49
Content-Type: application/json

--- request body ---
{"handle":"qa-f70ce60bec25","displayName":"QA f70ce60bec25","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-19f311d3-0fec-46ae-87b4-43832645fe49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 7
Location: /v1/accounts/qa-f70ce60bec25
X-Served-Region: eu
Content-Length: 181

{"id":"acc_63d1fea8-f1be-41e2-a2d3-809cf368282f","handle":"qa-f70ce60bec25","displayName":"QA f70ce60bec25","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.831599549Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-98a80442-0430-4719-8273-8256ee1382d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98a80442-0430-4719-8273-8256ee1382d9
Content-Type: application/json

--- request body ---
{"handle":"qa-f8c841e81385","password":"****"}

--- response: 200 in 28 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-98a80442-0430-4719-8273-8256ee1382d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_414db564-1ae1-4326-9b93-f467788b272b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-dd143ba1-e74c-4dcb-b1ac-09760250cf19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd143ba1-e74c-4dcb-b1ac-09760250cf19
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f70ce60bec25","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd143ba1-e74c-4dcb-b1ac-09760250cf19
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
Location: /v1/conversations/cnv_dd33a20a-2d79-4b7d-a897-041fe4f80748
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_dd33a20a-2d79-4b7d-a897-041fe4f80748","subject":"Error contract","status":"open","region":"eu","participants":["qa-f8c841e81385","qa-f70ce60bec25"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.926784542Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_dd33a20a-2d79-4b7d-a897-041fe4f80748/messages
correlation: qa-0882da17-ede2-4ad4-b130-35460b7f9a5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0882da17-ede2-4ad4-b130-35460b7f9a5c
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 30 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0882da17-ede2-4ad4-b130-35460b7f9a5c
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_dd33a20a-2d79-4b7d-a897-041fe4f80748/messages","correlationId":"qa-0882da17-ede2-4ad4-b130-35460b7f9a5c","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-df375366-0cbe-4a54-a0a4-cd5288c5b854

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df375366-0cbe-4a54-a0a4-cd5288c5b854
Content-Type: application/json

--- request body ---
{"handle":"qa-f70ce60bec25","password":"****"}

--- response: 200 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-df375366-0cbe-4a54-a0a4-cd5288c5b854
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_63d1fea8-f1be-41e2-a2d3-809cf368282f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bdc9c6f4-c802-4004-b35d-2a5ca82ebf76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdc9c6f4-c802-4004-b35d-2a5ca82ebf76
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bdc9c6f4-c802-4004-b35d-2a5ca82ebf76
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
correlation: qa-9d5d04c3-547e-4eb2-9cfd-0b4243f618bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d5d04c3-547e-4eb2-9cfd-0b4243f618bd
Content-Type: application/json

--- request body ---
{"handle":"qa-f70ce60bec25","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d5d04c3-547e-4eb2-9cfd-0b4243f618bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9d5d04c3-547e-4eb2-9cfd-0b4243f618bd"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6e93759b-ca63-4e31-a011-33bf83e587ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e93759b-ca63-4e31-a011-33bf83e587ab
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6e93759b-ca63-4e31-a011-33bf83e587ab
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
correlation: qa-d2206440-d7f3-4443-aac1-977d55369855

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2206440-d7f3-4443-aac1-977d55369855
Content-Type: application/json

--- request body ---
{"handle":"qa-f8c841e81385","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2206440-d7f3-4443-aac1-977d55369855
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d2206440-d7f3-4443-aac1-977d55369855"}
```
