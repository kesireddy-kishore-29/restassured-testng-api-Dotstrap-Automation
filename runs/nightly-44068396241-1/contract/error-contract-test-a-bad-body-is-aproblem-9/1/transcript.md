# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-73c45d91-8e78-4953-9b17-22287f8f211b` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-e7debf84-aed0-4c64-9170-2d974d33c4e4` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-a7d2dcbc-0ff1-4fcd-be83-423c8923fd6c` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-243e5a70-831b-4827-9a40-2d98c218ff95` |
| 5 | `POST /v1/conversations` | 400 | 17 | `qa-70ee3fcd-1b73-4094-8920-3e97ec4bf345` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-38d07fba-e493-48a2-85ac-6e268613987b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-c08b9df0-9807-4966-93b5-c9ef87fc2c12` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-66b373ac-0121-4f9b-bdf6-78f2e0267bcc` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-ba50e304-ebd4-4df1-b214-f6a9147f3cf4` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-03aee199-a018-4f92-b15e-a4d604e31fc8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-73c45d91-8e78-4953-9b17-22287f8f211b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73c45d91-8e78-4953-9b17-22287f8f211b
Content-Type: application/json

--- request body ---
{"handle":"qa-69076a3494e1","displayName":"QA 69076a3494e1","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-73c45d91-8e78-4953-9b17-22287f8f211b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 8
Location: /v1/accounts/qa-69076a3494e1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3291ffd5-511a-4fb1-a7f8-cca08116bdce","handle":"qa-69076a3494e1","displayName":"QA 69076a3494e1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.350170896Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e7debf84-aed0-4c64-9170-2d974d33c4e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7debf84-aed0-4c64-9170-2d974d33c4e4
Content-Type: application/json

--- request body ---
{"handle":"qa-96c7291d12bb","displayName":"QA 96c7291d12bb","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7debf84-aed0-4c64-9170-2d974d33c4e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 8
Location: /v1/accounts/qa-96c7291d12bb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8d606e56-44d3-4805-a554-220958817e95","handle":"qa-96c7291d12bb","displayName":"QA 96c7291d12bb","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.412586841Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a7d2dcbc-0ff1-4fcd-be83-423c8923fd6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7d2dcbc-0ff1-4fcd-be83-423c8923fd6c
Content-Type: application/json

--- request body ---
{"handle":"qa-69076a3494e1","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7d2dcbc-0ff1-4fcd-be83-423c8923fd6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3291ffd5-511a-4fb1-a7f8-cca08116bdce"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-243e5a70-831b-4827-9a40-2d98c218ff95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-243e5a70-831b-4827-9a40-2d98c218ff95
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-96c7291d12bb","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-243e5a70-831b-4827-9a40-2d98c218ff95
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
Location: /v1/conversations/cnv_b5473699-434d-4a2c-b556-44f4e00978aa
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b5473699-434d-4a2c-b556-44f4e00978aa","subject":"Error contract","status":"open","region":"eu","participants":["qa-69076a3494e1","qa-96c7291d12bb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.451579431Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-70ee3fcd-1b73-4094-8920-3e97ec4bf345

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70ee3fcd-1b73-4094-8920-3e97ec4bf345
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70ee3fcd-1b73-4094-8920-3e97ec4bf345
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-70ee3fcd-1b73-4094-8920-3e97ec4bf345"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-38d07fba-e493-48a2-85ac-6e268613987b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38d07fba-e493-48a2-85ac-6e268613987b
Content-Type: application/json

--- request body ---
{"handle":"qa-96c7291d12bb","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-38d07fba-e493-48a2-85ac-6e268613987b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8d606e56-44d3-4805-a554-220958817e95"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c08b9df0-9807-4966-93b5-c9ef87fc2c12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c08b9df0-9807-4966-93b5-c9ef87fc2c12
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c08b9df0-9807-4966-93b5-c9ef87fc2c12
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
correlation: qa-66b373ac-0121-4f9b-bdf6-78f2e0267bcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66b373ac-0121-4f9b-bdf6-78f2e0267bcc
Content-Type: application/json

--- request body ---
{"handle":"qa-96c7291d12bb","password":"****"}

--- response: 401 in 27 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-66b373ac-0121-4f9b-bdf6-78f2e0267bcc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-66b373ac-0121-4f9b-bdf6-78f2e0267bcc"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ba50e304-ebd4-4df1-b214-f6a9147f3cf4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba50e304-ebd4-4df1-b214-f6a9147f3cf4
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ba50e304-ebd4-4df1-b214-f6a9147f3cf4
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
correlation: qa-03aee199-a018-4f92-b15e-a4d604e31fc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03aee199-a018-4f92-b15e-a4d604e31fc8
Content-Type: application/json

--- request body ---
{"handle":"qa-69076a3494e1","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03aee199-a018-4f92-b15e-a4d604e31fc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-03aee199-a018-4f92-b15e-a4d604e31fc8"}
```
