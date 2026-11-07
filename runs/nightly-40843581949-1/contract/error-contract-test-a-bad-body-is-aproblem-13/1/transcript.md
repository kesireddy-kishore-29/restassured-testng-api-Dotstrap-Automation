# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-5193391b-ae52-4f66-a384-4cf2954e6e2b` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-1bcb30b4-f633-42ff-8ac9-45323420168d` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-25c07a7e-b757-40f0-9562-1558d2b5de24` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-c4ecb7cd-990f-4120-9af5-fb2ea376d3b4` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 18 | `qa-37e360e9-34d3-4fb1-88d1-00261429c125` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-f753ebf2-6e2a-4234-9c89-9d7b08423811` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-f72e4b90-8218-4879-85c2-f417c4331fac` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-bde69a4b-a69b-4c1e-9515-d5d49a6f6594` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-05190982-f53c-42c8-8b84-8f7b0ddc04c7` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-2defbbc2-9521-4f5e-9bab-9f40cd8e05d9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5193391b-ae52-4f66-a384-4cf2954e6e2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5193391b-ae52-4f66-a384-4cf2954e6e2b
Content-Type: application/json

--- request body ---
{"handle":"qa-ae2d0f778fc1","displayName":"QA ae2d0f778fc1","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-5193391b-ae52-4f66-a384-4cf2954e6e2b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 7
Location: /v1/accounts/qa-ae2d0f778fc1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c47e3ca0-f0ec-4706-809a-45c41054fd53","handle":"qa-ae2d0f778fc1","displayName":"QA ae2d0f778fc1","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.963508511Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1bcb30b4-f633-42ff-8ac9-45323420168d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bcb30b4-f633-42ff-8ac9-45323420168d
Content-Type: application/json

--- request body ---
{"handle":"qa-891cb80b620c","displayName":"QA 891cb80b620c","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-1bcb30b4-f633-42ff-8ac9-45323420168d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 7
Location: /v1/accounts/qa-891cb80b620c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e732a948-8d26-49eb-8d3c-e7cff78c8723","handle":"qa-891cb80b620c","displayName":"QA 891cb80b620c","region":"eu","role":"user","createdAt":"2026-10-29T08:39:01.030023314Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-25c07a7e-b757-40f0-9562-1558d2b5de24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25c07a7e-b757-40f0-9562-1558d2b5de24
Content-Type: application/json

--- request body ---
{"handle":"qa-ae2d0f778fc1","password":"****"}

--- response: 200 in 46 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-25c07a7e-b757-40f0-9562-1558d2b5de24
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c47e3ca0-f0ec-4706-809a-45c41054fd53"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c4ecb7cd-990f-4120-9af5-fb2ea376d3b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4ecb7cd-990f-4120-9af5-fb2ea376d3b4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-891cb80b620c","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4ecb7cd-990f-4120-9af5-fb2ea376d3b4
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
Location: /v1/conversations/cnv_74df54fe-47cb-40b8-8a6b-7378e4fc3049
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_74df54fe-47cb-40b8-8a6b-7378e4fc3049","subject":"Error contract","status":"open","region":"eu","participants":["qa-ae2d0f778fc1","qa-891cb80b620c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:01.106637077Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_74df54fe-47cb-40b8-8a6b-7378e4fc3049/messages
correlation: qa-37e360e9-34d3-4fb1-88d1-00261429c125

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37e360e9-34d3-4fb1-88d1-00261429c125
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37e360e9-34d3-4fb1-88d1-00261429c125
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_74df54fe-47cb-40b8-8a6b-7378e4fc3049/messages","correlationId":"qa-37e360e9-34d3-4fb1-88d1-00261429c125"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f753ebf2-6e2a-4234-9c89-9d7b08423811

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f753ebf2-6e2a-4234-9c89-9d7b08423811
Content-Type: application/json

--- request body ---
{"handle":"qa-891cb80b620c","password":"****"}

--- response: 200 in 26 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f753ebf2-6e2a-4234-9c89-9d7b08423811
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e732a948-8d26-49eb-8d3c-e7cff78c8723"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f72e4b90-8218-4879-85c2-f417c4331fac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f72e4b90-8218-4879-85c2-f417c4331fac
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f72e4b90-8218-4879-85c2-f417c4331fac
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
correlation: qa-bde69a4b-a69b-4c1e-9515-d5d49a6f6594

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bde69a4b-a69b-4c1e-9515-d5d49a6f6594
Content-Type: application/json

--- request body ---
{"handle":"qa-891cb80b620c","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bde69a4b-a69b-4c1e-9515-d5d49a6f6594
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bde69a4b-a69b-4c1e-9515-d5d49a6f6594"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-05190982-f53c-42c8-8b84-8f7b0ddc04c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05190982-f53c-42c8-8b84-8f7b0ddc04c7
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-05190982-f53c-42c8-8b84-8f7b0ddc04c7
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
correlation: qa-2defbbc2-9521-4f5e-9bab-9f40cd8e05d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2defbbc2-9521-4f5e-9bab-9f40cd8e05d9
Content-Type: application/json

--- request body ---
{"handle":"qa-ae2d0f778fc1","password":"****"}

--- response: 401 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2defbbc2-9521-4f5e-9bab-9f40cd8e05d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2defbbc2-9521-4f5e-9bab-9f40cd8e05d9"}
```
