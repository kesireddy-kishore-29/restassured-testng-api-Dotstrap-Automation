# Transcript: A token stops working when it expires

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#expiredTokenIsRefused` |
| Features | FEAT-SEC-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 349 | `qa-8de42c3c-9b02-46b1-a52c-c8fb7a883308` |
| 2 | `POST /v1/auth/token` | 200 | 40 | `qa-d359bfca-e5d5-4b9e-9b3d-0fe65257435b` |
| 3 | `GET /v1/accounts/me` | 200 | 10 | `qa-db60ba6c-dd26-415c-a8f5-800bcae9a222` |
| 4 | `GET /v1/accounts/me` | 200 | 13 | `qa-1dd5bf51-5691-4485-ac3b-5f910c418f1b` |
| 5 | `GET /v1/accounts/me` | 200 | 19 | `qa-33cd5801-2000-4a9b-9557-dd1064fb0c37` |
| 6 | `GET /v1/accounts/me` | 401 | 9 | `qa-0728f403-118b-41c3-85d7-9f9425955771` |
| 7 | `GET /v1/accounts/me` | 401 | 7 | `qa-a9ce5f4d-dcfa-4509-9479-ce01183b6457` |
| 8 | `POST /v1/auth/token` | 200 | 16 | `qa-488ea2fb-a011-4472-a70f-d6d74a068b3d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-8e8c7283-34f0-42d0-90f0-fb26496ee2af` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-2e2e0424-0177-48cd-be28-902d484a5a94` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8de42c3c-9b02-46b1-a52c-c8fb7a883308

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8de42c3c-9b02-46b1-a52c-c8fb7a883308
Content-Type: application/json

--- request body ---
{"handle":"qa-d4cae420880e","displayName":"QA d4cae420880e","password":"****","region":"eu"}

--- response: 201 in 349 ms ---
Date: Thu, 29 Oct 2026 08:38:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-8de42c3c-9b02-46b1-a52c-c8fb7a883308
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
Location: /v1/accounts/qa-d4cae420880e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5039ca36-b510-4cfc-8667-c6218e7fc0c1","handle":"qa-d4cae420880e","displayName":"QA d4cae420880e","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.956046028Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d359bfca-e5d5-4b9e-9b3d-0fe65257435b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d359bfca-e5d5-4b9e-9b3d-0fe65257435b
Content-Type: application/json

--- request body ---
{"handle":"qa-d4cae420880e","password":"****","ttlSeconds":1}

--- response: 200 in 40 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-d359bfca-e5d5-4b9e-9b3d-0fe65257435b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_5039ca36-b510-4cfc-8667-c6218e7fc0c1"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-db60ba6c-dd26-415c-a8f5-800bcae9a222

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db60ba6c-dd26-415c-a8f5-800bcae9a222
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-db60ba6c-dd26-415c-a8f5-800bcae9a222
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
Content-Length: 181

{"id":"acc_5039ca36-b510-4cfc-8667-c6218e7fc0c1","handle":"qa-d4cae420880e","displayName":"QA d4cae420880e","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.956046028Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-1dd5bf51-5691-4485-ac3b-5f910c418f1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1dd5bf51-5691-4485-ac3b-5f910c418f1b
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-1dd5bf51-5691-4485-ac3b-5f910c418f1b
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
Content-Length: 181

{"id":"acc_5039ca36-b510-4cfc-8667-c6218e7fc0c1","handle":"qa-d4cae420880e","displayName":"QA d4cae420880e","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.956046028Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-33cd5801-2000-4a9b-9557-dd1064fb0c37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33cd5801-2000-4a9b-9557-dd1064fb0c37
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-33cd5801-2000-4a9b-9557-dd1064fb0c37
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
Content-Length: 181

{"id":"acc_5039ca36-b510-4cfc-8667-c6218e7fc0c1","handle":"qa-d4cae420880e","displayName":"QA d4cae420880e","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.956046028Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-0728f403-118b-41c3-85d7-9f9425955771

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0728f403-118b-41c3-85d7-9f9425955771
Content-Type: application/json

--- response: 401 in 9 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0728f403-118b-41c3-85d7-9f9425955771
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-0728f403-118b-41c3-85d7-9f9425955771"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-a9ce5f4d-dcfa-4509-9479-ce01183b6457

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9ce5f4d-dcfa-4509-9479-ce01183b6457
Content-Type: application/json

--- response: 401 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9ce5f4d-dcfa-4509-9479-ce01183b6457
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-a9ce5f4d-dcfa-4509-9479-ce01183b6457"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-488ea2fb-a011-4472-a70f-d6d74a068b3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-488ea2fb-a011-4472-a70f-d6d74a068b3d
Content-Type: application/json

--- request body ---
{"handle":"qa-d4cae420880e","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-488ea2fb-a011-4472-a70f-d6d74a068b3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5039ca36-b510-4cfc-8667-c6218e7fc0c1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e8c7283-34f0-42d0-90f0-fb26496ee2af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e8c7283-34f0-42d0-90f0-fb26496ee2af
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e8c7283-34f0-42d0-90f0-fb26496ee2af
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-2e2e0424-0177-48cd-be28-902d484a5a94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e2e0424-0177-48cd-be28-902d484a5a94
Content-Type: application/json

--- request body ---
{"handle":"qa-d4cae420880e","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e2e0424-0177-48cd-be28-902d484a5a94
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2e2e0424-0177-48cd-be28-902d484a5a94"}
```
