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
| 1 | `POST /v1/accounts` | 201 | 50 | `qa-dde1a721-7c88-4bd2-a0b4-11cc86f865c7` |
| 2 | `POST /v1/accounts` | 201 | 72 | `qa-3031950f-9292-4aab-a828-b1c9681934f4` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-097cd151-26b1-45b8-a388-957347edcd84` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-aeaf768a-4ad3-4fd9-9702-598bc5f141ca` |
| 5 | `POST /v1/conversations` | 400 | 11 | `qa-20dc003c-ff36-48e4-ac68-fbe16ecd5727` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-f7a9e95d-172b-4a19-9cbf-3b0675b36d2b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-9ee79f1a-fc24-43d0-b3be-f1a243b5befb` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-43c3263d-fd81-4e88-9638-2936528a31a1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-6add757f-8828-47db-9932-66b22886684b` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-9d7b3dfe-cbf6-4e1b-bfb1-276039a3ca9b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dde1a721-7c88-4bd2-a0b4-11cc86f865c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dde1a721-7c88-4bd2-a0b4-11cc86f865c7
Content-Type: application/json

--- request body ---
{"handle":"qa-73e3cef6984e","displayName":"QA 73e3cef6984e","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-dde1a721-7c88-4bd2-a0b4-11cc86f865c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 8
Location: /v1/accounts/qa-73e3cef6984e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bdef776f-d731-49b2-b24e-b89c7ff0c745","handle":"qa-73e3cef6984e","displayName":"QA 73e3cef6984e","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.359850901Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3031950f-9292-4aab-a828-b1c9681934f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3031950f-9292-4aab-a828-b1c9681934f4
Content-Type: application/json

--- request body ---
{"handle":"qa-d28fa978e5b9","displayName":"QA d28fa978e5b9","password":"****","region":"eu"}

--- response: 201 in 72 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3031950f-9292-4aab-a828-b1c9681934f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 8
Location: /v1/accounts/qa-d28fa978e5b9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6bde92b2-4588-46cd-a156-f9b48c7b43fe","handle":"qa-d28fa978e5b9","displayName":"QA d28fa978e5b9","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.428095505Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-097cd151-26b1-45b8-a388-957347edcd84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-097cd151-26b1-45b8-a388-957347edcd84
Content-Type: application/json

--- request body ---
{"handle":"qa-73e3cef6984e","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-097cd151-26b1-45b8-a388-957347edcd84
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bdef776f-d731-49b2-b24e-b89c7ff0c745"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-aeaf768a-4ad3-4fd9-9702-598bc5f141ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aeaf768a-4ad3-4fd9-9702-598bc5f141ca
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d28fa978e5b9","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-aeaf768a-4ad3-4fd9-9702-598bc5f141ca
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
Location: /v1/conversations/cnv_965d3af7-5a25-40d3-baca-7ae2082d9cea
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_965d3af7-5a25-40d3-baca-7ae2082d9cea","subject":"Error contract","status":"open","region":"eu","participants":["qa-73e3cef6984e","qa-d28fa978e5b9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:59.505477431Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-20dc003c-ff36-48e4-ac68-fbe16ecd5727

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20dc003c-ff36-48e4-ac68-fbe16ecd5727
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 11 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-20dc003c-ff36-48e4-ac68-fbe16ecd5727
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-20dc003c-ff36-48e4-ac68-fbe16ecd5727"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f7a9e95d-172b-4a19-9cbf-3b0675b36d2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7a9e95d-172b-4a19-9cbf-3b0675b36d2b
Content-Type: application/json

--- request body ---
{"handle":"qa-d28fa978e5b9","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7a9e95d-172b-4a19-9cbf-3b0675b36d2b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6bde92b2-4588-46cd-a156-f9b48c7b43fe"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9ee79f1a-fc24-43d0-b3be-f1a243b5befb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ee79f1a-fc24-43d0-b3be-f1a243b5befb
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9ee79f1a-fc24-43d0-b3be-f1a243b5befb
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
correlation: qa-43c3263d-fd81-4e88-9638-2936528a31a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43c3263d-fd81-4e88-9638-2936528a31a1
Content-Type: application/json

--- request body ---
{"handle":"qa-d28fa978e5b9","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-43c3263d-fd81-4e88-9638-2936528a31a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-43c3263d-fd81-4e88-9638-2936528a31a1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6add757f-8828-47db-9932-66b22886684b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6add757f-8828-47db-9932-66b22886684b
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6add757f-8828-47db-9932-66b22886684b
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
correlation: qa-9d7b3dfe-cbf6-4e1b-bfb1-276039a3ca9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d7b3dfe-cbf6-4e1b-bfb1-276039a3ca9b
Content-Type: application/json

--- request body ---
{"handle":"qa-73e3cef6984e","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d7b3dfe-cbf6-4e1b-bfb1-276039a3ca9b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9d7b3dfe-cbf6-4e1b-bfb1-276039a3ca9b"}
```
