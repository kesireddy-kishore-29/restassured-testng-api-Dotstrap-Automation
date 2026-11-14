# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[10]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-bacec8ff-6e38-46b6-ad96-9dc0a68192d0` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-6017cbcb-72ea-4cd2-a4a4-44a91b2ac645` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-12137c9e-b6f5-4b18-b122-e843862cf435` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-98249fff-ca23-4ef9-88c4-c83caf94aac3` |
| 5 | `POST /v1/conversations` | 415 | 14 | `qa-e9460de2-8e88-429a-b3cc-f10e4685f29d` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-bfb3ff43-5811-4f20-b147-bb1e10ec40d1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-22002916-86b1-428c-83d8-7047f877720d` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-5bed1acc-d8e5-48f1-bc89-4796b910af06` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-8b29bf53-6fac-4dc4-bad7-6b90601e4db5` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-99ed9cf3-9deb-4219-a96a-726c3ebd817d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bacec8ff-6e38-46b6-ad96-9dc0a68192d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bacec8ff-6e38-46b6-ad96-9dc0a68192d0
Content-Type: application/json

--- request body ---
{"handle":"qa-ea5a7c005bee","displayName":"QA ea5a7c005bee","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-bacec8ff-6e38-46b6-ad96-9dc0a68192d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 7
Location: /v1/accounts/qa-ea5a7c005bee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8f38ee75-a29c-4dd5-a135-ebbf4b6ee837","handle":"qa-ea5a7c005bee","displayName":"QA ea5a7c005bee","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.323734634Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6017cbcb-72ea-4cd2-a4a4-44a91b2ac645

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6017cbcb-72ea-4cd2-a4a4-44a91b2ac645
Content-Type: application/json

--- request body ---
{"handle":"qa-8f18f7e1b77c","displayName":"QA 8f18f7e1b77c","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-6017cbcb-72ea-4cd2-a4a4-44a91b2ac645
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 7
Location: /v1/accounts/qa-8f18f7e1b77c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49d6ee5c-8ab5-4c07-be70-82bebc86871a","handle":"qa-8f18f7e1b77c","displayName":"QA 8f18f7e1b77c","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.370860022Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-12137c9e-b6f5-4b18-b122-e843862cf435

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12137c9e-b6f5-4b18-b122-e843862cf435
Content-Type: application/json

--- request body ---
{"handle":"qa-ea5a7c005bee","password":"****"}

--- response: 200 in 37 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-12137c9e-b6f5-4b18-b122-e843862cf435
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8f38ee75-a29c-4dd5-a135-ebbf4b6ee837"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-98249fff-ca23-4ef9-88c4-c83caf94aac3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98249fff-ca23-4ef9-88c4-c83caf94aac3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8f18f7e1b77c","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-98249fff-ca23-4ef9-88c4-c83caf94aac3
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
Location: /v1/conversations/cnv_6bf3ba3a-5c39-4ab4-bb3f-7ed5ef005de1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6bf3ba3a-5c39-4ab4-bb3f-7ed5ef005de1","subject":"Error contract","status":"open","region":"eu","participants":["qa-ea5a7c005bee","qa-8f18f7e1b77c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:38.446946191Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-e9460de2-8e88-429a-b3cc-f10e4685f29d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9460de2-8e88-429a-b3cc-f10e4685f29d
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9460de2-8e88-429a-b3cc-f10e4685f29d
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
Content-Length: 257

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-e9460de2-8e88-429a-b3cc-f10e4685f29d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bfb3ff43-5811-4f20-b147-bb1e10ec40d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfb3ff43-5811-4f20-b147-bb1e10ec40d1
Content-Type: application/json

--- request body ---
{"handle":"qa-8f18f7e1b77c","password":"****"}

--- response: 200 in 36 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfb3ff43-5811-4f20-b147-bb1e10ec40d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_49d6ee5c-8ab5-4c07-be70-82bebc86871a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-22002916-86b1-428c-83d8-7047f877720d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22002916-86b1-428c-83d8-7047f877720d
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-22002916-86b1-428c-83d8-7047f877720d
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
correlation: qa-5bed1acc-d8e5-48f1-bc89-4796b910af06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bed1acc-d8e5-48f1-bc89-4796b910af06
Content-Type: application/json

--- request body ---
{"handle":"qa-8f18f7e1b77c","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5bed1acc-d8e5-48f1-bc89-4796b910af06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5bed1acc-d8e5-48f1-bc89-4796b910af06"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8b29bf53-6fac-4dc4-bad7-6b90601e4db5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b29bf53-6fac-4dc4-bad7-6b90601e4db5
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8b29bf53-6fac-4dc4-bad7-6b90601e4db5
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
correlation: qa-99ed9cf3-9deb-4219-a96a-726c3ebd817d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99ed9cf3-9deb-4219-a96a-726c3ebd817d
Content-Type: application/json

--- request body ---
{"handle":"qa-ea5a7c005bee","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-99ed9cf3-9deb-4219-a96a-726c3ebd817d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-99ed9cf3-9deb-4219-a96a-726c3ebd817d"}
```
