# Transcript: Unknown conversations and handles are 404 problems

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#unknownResourcesAre404` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 324 | `qa-3544c96f-fa3c-4706-ac28-7115c981c788` |
| 2 | `POST /v1/auth/token` | 200 | 45 | `qa-94ff28b9-6427-4698-bc06-1091bc99818c` |
| 3 | `GET /v1/conversations/{id}` | 404 | 47 | `qa-0dda2c46-e484-4e11-a51f-0c0102b8218c` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 21 | `qa-92b15ead-314f-4903-a8c5-683394f717ee` |
| 5 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-9a346040-a450-49c8-b5e4-5f9aa2ed97b0` |
| 6 | `POST /v1/auth/token` | 401 | 8 | `qa-7e77ef91-177f-4930-b223-3b4f2b8c2856` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3544c96f-fa3c-4706-ac28-7115c981c788

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3544c96f-fa3c-4706-ac28-7115c981c788
Content-Type: application/json

--- request body ---
{"handle":"qa-5fd2c5b78196","displayName":"QA 5fd2c5b78196","password":"****","region":"eu"}

--- response: 201 in 324 ms ---
Date: Sun, 08 Nov 2026 09:09:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-3544c96f-fa3c-4706-ac28-7115c981c788
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-5fd2c5b78196
X-Served-Region: eu
Content-Length: 181

{"id":"acc_79408b27-2ec9-4d01-86c0-79f45fa82ebb","handle":"qa-5fd2c5b78196","displayName":"QA 5fd2c5b78196","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.807519018Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-94ff28b9-6427-4698-bc06-1091bc99818c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94ff28b9-6427-4698-bc06-1091bc99818c
Content-Type: application/json

--- request body ---
{"handle":"qa-5fd2c5b78196","password":"****"}

--- response: 200 in 45 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-94ff28b9-6427-4698-bc06-1091bc99818c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_79408b27-2ec9-4d01-86c0-79f45fa82ebb"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-0dda2c46-e484-4e11-a51f-0c0102b8218c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dda2c46-e484-4e11-a51f-0c0102b8218c
Content-Type: application/json

--- response: 404 in 47 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0dda2c46-e484-4e11-a51f-0c0102b8218c
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-0dda2c46-e484-4e11-a51f-0c0102b8218c"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-92b15ead-314f-4903-a8c5-683394f717ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92b15ead-314f-4903-a8c5-683394f717ee
Content-Type: application/json

--- response: 404 in 21 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92b15ead-314f-4903-a8c5-683394f717ee
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
Content-Length: 247

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-92b15ead-314f-4903-a8c5-683394f717ee"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9a346040-a450-49c8-b5e4-5f9aa2ed97b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a346040-a450-49c8-b5e4-5f9aa2ed97b0
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9a346040-a450-49c8-b5e4-5f9aa2ed97b0
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7e77ef91-177f-4930-b223-3b4f2b8c2856

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e77ef91-177f-4930-b223-3b4f2b8c2856
Content-Type: application/json

--- request body ---
{"handle":"qa-5fd2c5b78196","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e77ef91-177f-4930-b223-3b4f2b8c2856
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7e77ef91-177f-4930-b223-3b4f2b8c2856"}
```
