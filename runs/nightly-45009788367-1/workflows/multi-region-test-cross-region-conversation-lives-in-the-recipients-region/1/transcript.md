# Transcript: A cross-region conversation is stored in the recipient's region, for both sides

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#crossRegionConversationLivesInTheRecipientsRegion` |
| Features | FEAT-REGION-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 498 | `qa-b666deae-9da3-4af1-92b8-7296e0784e56` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-e1b5446a-0d5e-4b7a-bcbe-1b2ab9f20840` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-4e695869-96ca-4509-a498-cfb49575411a` |
| 4 | `POST /v1/conversations` | 201 | 68 | `qa-ade5d762-5923-4ec1-b0c1-a1c9bbf13559` |
| 5 | `GET /v1/conversations/{id}` | 200 | 55 | `qa-c330472d-dbc4-470d-bfe5-860906486933` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-d4c4244a-beaf-4157-9300-997ac441be54` |
| 7 | `GET /v1/conversations/{id}` | 200 | 14 | `qa-94b4d03b-62a2-4c53-9c1c-8a07f0a49a3f` |
| 8 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-6f6d0450-d4f5-4193-bed9-d89d098347fc` |
| 9 | `POST /v1/auth/token` | 401 | 19 | `qa-02624648-0b03-4556-b7c0-8da8ae90458e` |
| 10 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-adaa6e23-2cc5-44f0-856f-1f7d63b105be` |
| 11 | `POST /v1/auth/token` | 401 | 16 | `qa-28685352-9938-4704-b06f-07b9de571c7a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b666deae-9da3-4af1-92b8-7296e0784e56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b666deae-9da3-4af1-92b8-7296e0784e56
Content-Type: application/json

--- request body ---
{"handle":"qa-44c03a232697","displayName":"QA 44c03a232697","password":"****","region":"in"}

--- response: 201 in 498 ms ---
Date: Sun, 22 Nov 2026 09:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-b666deae-9da3-4af1-92b8-7296e0784e56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-44c03a232697
X-Served-Region: in
Content-Length: 181

{"id":"acc_4ca44ef9-9351-4b30-a590-35b6782ac805","handle":"qa-44c03a232697","displayName":"QA 44c03a232697","region":"in","role":"user","createdAt":"2026-11-22T09:54:48.311601023Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e1b5446a-0d5e-4b7a-bcbe-1b2ab9f20840

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1b5446a-0d5e-4b7a-bcbe-1b2ab9f20840
Content-Type: application/json

--- request body ---
{"handle":"qa-12aa3a687bcf","displayName":"QA 12aa3a687bcf","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Sun, 22 Nov 2026 09:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1b5446a-0d5e-4b7a-bcbe-1b2ab9f20840
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
Location: /v1/accounts/qa-12aa3a687bcf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c8df1c15-e8c1-4a1e-899a-a81632200ec9","handle":"qa-12aa3a687bcf","displayName":"QA 12aa3a687bcf","region":"eu","role":"user","createdAt":"2026-11-22T09:54:48.879188226Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4e695869-96ca-4509-a498-cfb49575411a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e695869-96ca-4509-a498-cfb49575411a
Content-Type: application/json

--- request body ---
{"handle":"qa-44c03a232697","password":"****"}

--- response: 200 in 33 ms ---
Date: Sun, 22 Nov 2026 09:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e695869-96ca-4509-a498-cfb49575411a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4ca44ef9-9351-4b30-a590-35b6782ac805"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ade5d762-5923-4ec1-b0c1-a1c9bbf13559

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ade5d762-5923-4ec1-b0c1-a1c9bbf13559
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-12aa3a687bcf","subject":"Across regions","message":"Namaste"}

--- response: 201 in 68 ms ---
Date: Sun, 22 Nov 2026 09:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-ade5d762-5923-4ec1-b0c1-a1c9bbf13559
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
X-Served-Region: in
Location: /v1/conversations/cnv_2fb15514-e87c-4ac4-bacc-6ebc03cb2168
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2fb15514-e87c-4ac4-bacc-6ebc03cb2168","subject":"Across regions","status":"open","region":"eu","participants":["qa-44c03a232697","qa-12aa3a687bcf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:48.999155432Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_2fb15514-e87c-4ac4-bacc-6ebc03cb2168
correlation: qa-c330472d-dbc4-470d-bfe5-860906486933

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c330472d-dbc4-470d-bfe5-860906486933
Content-Type: application/json

--- response: 200 in 55 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-c330472d-dbc4-470d-bfe5-860906486933
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
X-Served-Region: in
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2fb15514-e87c-4ac4-bacc-6ebc03cb2168","subject":"Across regions","status":"open","region":"eu","participants":["qa-44c03a232697","qa-12aa3a687bcf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:48.999155432Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d4c4244a-beaf-4157-9300-997ac441be54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4c4244a-beaf-4157-9300-997ac441be54
Content-Type: application/json

--- request body ---
{"handle":"qa-12aa3a687bcf","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4c4244a-beaf-4157-9300-997ac441be54
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c8df1c15-e8c1-4a1e-899a-a81632200ec9"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_2fb15514-e87c-4ac4-bacc-6ebc03cb2168
correlation: qa-94b4d03b-62a2-4c53-9c1c-8a07f0a49a3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94b4d03b-62a2-4c53-9c1c-8a07f0a49a3f
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-94b4d03b-62a2-4c53-9c1c-8a07f0a49a3f
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
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2fb15514-e87c-4ac4-bacc-6ebc03cb2168","subject":"Across regions","status":"open","region":"eu","participants":["qa-44c03a232697","qa-12aa3a687bcf"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-22T09:54:48.999155432Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6f6d0450-d4f5-4193-bed9-d89d098347fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f6d0450-d4f5-4193-bed9-d89d098347fc
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6f6d0450-d4f5-4193-bed9-d89d098347fc
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-02624648-0b03-4556-b7c0-8da8ae90458e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02624648-0b03-4556-b7c0-8da8ae90458e
Content-Type: application/json

--- request body ---
{"handle":"qa-12aa3a687bcf","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-02624648-0b03-4556-b7c0-8da8ae90458e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-02624648-0b03-4556-b7c0-8da8ae90458e"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-adaa6e23-2cc5-44f0-856f-1f7d63b105be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adaa6e23-2cc5-44f0-856f-1f7d63b105be
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-adaa6e23-2cc5-44f0-856f-1f7d63b105be
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
X-Served-Region: in
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-28685352-9938-4704-b06f-07b9de571c7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28685352-9938-4704-b06f-07b9de571c7a
Content-Type: application/json

--- request body ---
{"handle":"qa-44c03a232697","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-28685352-9938-4704-b06f-07b9de571c7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-28685352-9938-4704-b06f-07b9de571c7a"}
```
