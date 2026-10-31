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
| 1 | `POST /v1/accounts` | 201 | 60 | `qa-925da69b-086f-4f45-bc6f-a1df4efe9bdd` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-87dc367e-af26-4b67-b7bf-ed3cec26be78` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-53867df0-5852-4f3e-ae53-c8353efe9c30` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-ff2dbb08-969a-4cb4-86af-98a27b4b46d7` |
| 5 | `PATCH /v1/accounts/me` | 415 | 12 | `qa-77a17f27-c9c2-49ef-a392-79a253b9d47b` |
| 6 | `POST /v1/auth/token` | 200 | 49 | `qa-2d864c51-a502-42b2-beb0-34f1898831c1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-4465790a-be57-4dbe-8766-2c27385a5fd3` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-3c262be2-cc48-45b5-970c-7cf7c99c8571` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-9f95a09a-37c0-4056-8c6b-ed6c21a4d271` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-79537542-39bc-47dc-8b17-1932e894ec42` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-925da69b-086f-4f45-bc6f-a1df4efe9bdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-925da69b-086f-4f45-bc6f-a1df4efe9bdd
Content-Type: application/json

--- request body ---
{"handle":"qa-8e255e0b314f","displayName":"QA 8e255e0b314f","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-925da69b-086f-4f45-bc6f-a1df4efe9bdd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 7
Location: /v1/accounts/qa-8e255e0b314f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_25db651d-f4e5-400f-8054-fdf1aacdec67","handle":"qa-8e255e0b314f","displayName":"QA 8e255e0b314f","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.540504361Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-87dc367e-af26-4b67-b7bf-ed3cec26be78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87dc367e-af26-4b67-b7bf-ed3cec26be78
Content-Type: application/json

--- request body ---
{"handle":"qa-8daad111683e","displayName":"QA 8daad111683e","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-87dc367e-af26-4b67-b7bf-ed3cec26be78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 7
Location: /v1/accounts/qa-8daad111683e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f5b8d879-4c31-4327-8c83-42492391abca","handle":"qa-8daad111683e","displayName":"QA 8daad111683e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.594992876Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-53867df0-5852-4f3e-ae53-c8353efe9c30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53867df0-5852-4f3e-ae53-c8353efe9c30
Content-Type: application/json

--- request body ---
{"handle":"qa-8e255e0b314f","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-53867df0-5852-4f3e-ae53-c8353efe9c30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_25db651d-f4e5-400f-8054-fdf1aacdec67"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ff2dbb08-969a-4cb4-86af-98a27b4b46d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff2dbb08-969a-4cb4-86af-98a27b4b46d7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8daad111683e","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff2dbb08-969a-4cb4-86af-98a27b4b46d7
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
Location: /v1/conversations/cnv_1be720b0-4d4f-4d87-a1d7-19573a0129e4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1be720b0-4d4f-4d87-a1d7-19573a0129e4","subject":"Error contract","status":"open","region":"eu","participants":["qa-8e255e0b314f","qa-8daad111683e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:45.681990565Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-77a17f27-c9c2-49ef-a392-79a253b9d47b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77a17f27-c9c2-49ef-a392-79a253b9d47b
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 12 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-77a17f27-c9c2-49ef-a392-79a253b9d47b
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-77a17f27-c9c2-49ef-a392-79a253b9d47b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2d864c51-a502-42b2-beb0-34f1898831c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d864c51-a502-42b2-beb0-34f1898831c1
Content-Type: application/json

--- request body ---
{"handle":"qa-8daad111683e","password":"****"}

--- response: 200 in 49 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d864c51-a502-42b2-beb0-34f1898831c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f5b8d879-4c31-4327-8c83-42492391abca"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4465790a-be57-4dbe-8766-2c27385a5fd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4465790a-be57-4dbe-8766-2c27385a5fd3
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4465790a-be57-4dbe-8766-2c27385a5fd3
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
correlation: qa-3c262be2-cc48-45b5-970c-7cf7c99c8571

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c262be2-cc48-45b5-970c-7cf7c99c8571
Content-Type: application/json

--- request body ---
{"handle":"qa-8daad111683e","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3c262be2-cc48-45b5-970c-7cf7c99c8571
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3c262be2-cc48-45b5-970c-7cf7c99c8571"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9f95a09a-37c0-4056-8c6b-ed6c21a4d271

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f95a09a-37c0-4056-8c6b-ed6c21a4d271
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9f95a09a-37c0-4056-8c6b-ed6c21a4d271
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
correlation: qa-79537542-39bc-47dc-8b17-1932e894ec42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79537542-39bc-47dc-8b17-1932e894ec42
Content-Type: application/json

--- request body ---
{"handle":"qa-8e255e0b314f","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-79537542-39bc-47dc-8b17-1932e894ec42
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-79537542-39bc-47dc-8b17-1932e894ec42"}
```
