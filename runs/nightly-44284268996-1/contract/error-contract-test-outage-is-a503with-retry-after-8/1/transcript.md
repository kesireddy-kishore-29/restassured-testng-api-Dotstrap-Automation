# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-9ba19508-b4b2-4efd-9552-124e28c8d65b` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-ee8bb95b-8893-426b-9302-0d901eaad016` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-977d1440-02d1-49c9-817a-cafb28b23d55` |
| 4 | `POST /v1/conversations` | 201 | 41 | `qa-2a97e4da-e177-4cbe-93fd-541014c03eaf` |
| 5 | `GET /v1/conversations/{id}` | 503 | 25 | `qa-09a0457b-630d-4670-b07e-c5c57ca91f8e` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-68f6cd6c-8425-43a2-928e-b923815ca32a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-27f2baa5-bc78-45cf-9c51-ec33d08007ba` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-a7a86a1c-d517-4d76-9303-f78ba2722be6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-da43fede-b12d-4f78-a0a9-24f52762a99a` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-c099b6dc-99c6-43ae-a319-c87726b37122` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9ba19508-b4b2-4efd-9552-124e28c8d65b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ba19508-b4b2-4efd-9552-124e28c8d65b
Content-Type: application/json

--- request body ---
{"handle":"qa-5f9dc0f880bb","displayName":"QA 5f9dc0f880bb","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ba19508-b4b2-4efd-9552-124e28c8d65b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 8
Location: /v1/accounts/qa-5f9dc0f880bb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_69396054-995e-4252-be90-25f2f0b0f2f0","handle":"qa-5f9dc0f880bb","displayName":"QA 5f9dc0f880bb","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.101612147Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ee8bb95b-8893-426b-9302-0d901eaad016

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee8bb95b-8893-426b-9302-0d901eaad016
Content-Type: application/json

--- request body ---
{"handle":"qa-212eb35b2b39","displayName":"QA 212eb35b2b39","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee8bb95b-8893-426b-9302-0d901eaad016
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 8
Location: /v1/accounts/qa-212eb35b2b39
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7b1dbff3-25f2-444a-9b6a-803f08255300","handle":"qa-212eb35b2b39","displayName":"QA 212eb35b2b39","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.128216138Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-977d1440-02d1-49c9-817a-cafb28b23d55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-977d1440-02d1-49c9-817a-cafb28b23d55
Content-Type: application/json

--- request body ---
{"handle":"qa-5f9dc0f880bb","password":"****"}

--- response: 200 in 37 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-977d1440-02d1-49c9-817a-cafb28b23d55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_69396054-995e-4252-be90-25f2f0b0f2f0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2a97e4da-e177-4cbe-93fd-541014c03eaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a97e4da-e177-4cbe-93fd-541014c03eaf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-212eb35b2b39","subject":"Error contract","message":"Hi"}

--- response: 201 in 41 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a97e4da-e177-4cbe-93fd-541014c03eaf
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
Location: /v1/conversations/cnv_40d39950-faf5-448b-9c92-4bf51cc07974
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_40d39950-faf5-448b-9c92-4bf51cc07974","subject":"Error contract","status":"open","region":"eu","participants":["qa-5f9dc0f880bb","qa-212eb35b2b39"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.228901465Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_40d39950-faf5-448b-9c92-4bf51cc07974
correlation: qa-09a0457b-630d-4670-b07e-c5c57ca91f8e

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: abaff2d5-2e3d-4e0c-b882-b6a0def902ea
X-Correlation-Id: qa-09a0457b-630d-4670-b07e-c5c57ca91f8e
Content-Type: application/json

--- response: 503 in 25 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09a0457b-630d-4670-b07e-c5c57ca91f8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_40d39950-faf5-448b-9c92-4bf51cc07974","correlationId":"qa-09a0457b-630d-4670-b07e-c5c57ca91f8e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-68f6cd6c-8425-43a2-928e-b923815ca32a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68f6cd6c-8425-43a2-928e-b923815ca32a
Content-Type: application/json

--- request body ---
{"handle":"qa-212eb35b2b39","password":"****"}

--- response: 200 in 42 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-68f6cd6c-8425-43a2-928e-b923815ca32a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7b1dbff3-25f2-444a-9b6a-803f08255300"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-27f2baa5-bc78-45cf-9c51-ec33d08007ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27f2baa5-bc78-45cf-9c51-ec33d08007ba
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-27f2baa5-bc78-45cf-9c51-ec33d08007ba
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
correlation: qa-a7a86a1c-d517-4d76-9303-f78ba2722be6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7a86a1c-d517-4d76-9303-f78ba2722be6
Content-Type: application/json

--- request body ---
{"handle":"qa-212eb35b2b39","password":"****"}

--- response: 401 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a7a86a1c-d517-4d76-9303-f78ba2722be6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a7a86a1c-d517-4d76-9303-f78ba2722be6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-da43fede-b12d-4f78-a0a9-24f52762a99a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da43fede-b12d-4f78-a0a9-24f52762a99a
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-da43fede-b12d-4f78-a0a9-24f52762a99a
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
correlation: qa-c099b6dc-99c6-43ae-a319-c87726b37122

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c099b6dc-99c6-43ae-a319-c87726b37122
Content-Type: application/json

--- request body ---
{"handle":"qa-5f9dc0f880bb","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c099b6dc-99c6-43ae-a319-c87726b37122
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c099b6dc-99c6-43ae-a319-c87726b37122"}
```
