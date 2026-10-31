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
| 1 | `POST /v1/accounts` | 201 | 68 | `qa-93c66810-4ecf-4763-8bdc-76b4540555ee` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-b93e991b-6e94-4b80-8c63-3dec747e3f41` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-074fae54-54cd-45b6-b0cc-2760d7338a16` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-f913db26-ec08-4528-b7db-3b10de896a64` |
| 5 | `PATCH /v1/accounts/me` | 415 | 37 | `qa-ef81e653-aeb7-460e-ab32-27abb65ee89e` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-d83898be-0f4c-4450-8f42-4303e39f5655` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-c7759c85-aea8-43f1-9aa0-227067829f67` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-d8b372f9-77f1-4d4b-b057-ec30a186c40a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-39da2eb6-bb42-4c88-b170-bde1cbe7b701` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-67b85390-5eff-4120-aef2-1948ec97659a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-93c66810-4ecf-4763-8bdc-76b4540555ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93c66810-4ecf-4763-8bdc-76b4540555ee
Content-Type: application/json

--- request body ---
{"handle":"qa-123e3bfc5888","displayName":"QA 123e3bfc5888","password":"****","region":"eu"}

--- response: 201 in 68 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-93c66810-4ecf-4763-8bdc-76b4540555ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 8
Location: /v1/accounts/qa-123e3bfc5888
X-Served-Region: eu
Content-Length: 181

{"id":"acc_54273039-f20b-4eac-9388-4c971634e8f1","handle":"qa-123e3bfc5888","displayName":"QA 123e3bfc5888","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.641401042Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b93e991b-6e94-4b80-8c63-3dec747e3f41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b93e991b-6e94-4b80-8c63-3dec747e3f41
Content-Type: application/json

--- request body ---
{"handle":"qa-c0986c2fc4c3","displayName":"QA c0986c2fc4c3","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-b93e991b-6e94-4b80-8c63-3dec747e3f41
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 8
Location: /v1/accounts/qa-c0986c2fc4c3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c0c0044d-badf-4808-a6fb-5c40379e3d21","handle":"qa-c0986c2fc4c3","displayName":"QA c0986c2fc4c3","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.666804822Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-074fae54-54cd-45b6-b0cc-2760d7338a16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-074fae54-54cd-45b6-b0cc-2760d7338a16
Content-Type: application/json

--- request body ---
{"handle":"qa-123e3bfc5888","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-074fae54-54cd-45b6-b0cc-2760d7338a16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_54273039-f20b-4eac-9388-4c971634e8f1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f913db26-ec08-4528-b7db-3b10de896a64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f913db26-ec08-4528-b7db-3b10de896a64
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c0986c2fc4c3","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-f913db26-ec08-4528-b7db-3b10de896a64
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
Location: /v1/conversations/cnv_8ab0907a-54c2-4b44-88b7-8d4f6bd57887
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8ab0907a-54c2-4b44-88b7-8d4f6bd57887","subject":"Error contract","status":"open","region":"eu","participants":["qa-123e3bfc5888","qa-c0986c2fc4c3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:47.709380033Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-ef81e653-aeb7-460e-ab32-27abb65ee89e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef81e653-aeb7-460e-ab32-27abb65ee89e
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 37 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ef81e653-aeb7-460e-ab32-27abb65ee89e
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-ef81e653-aeb7-460e-ab32-27abb65ee89e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d83898be-0f4c-4450-8f42-4303e39f5655

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d83898be-0f4c-4450-8f42-4303e39f5655
Content-Type: application/json

--- request body ---
{"handle":"qa-c0986c2fc4c3","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-d83898be-0f4c-4450-8f42-4303e39f5655
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c0c0044d-badf-4808-a6fb-5c40379e3d21"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c7759c85-aea8-43f1-9aa0-227067829f67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7759c85-aea8-43f1-9aa0-227067829f67
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c7759c85-aea8-43f1-9aa0-227067829f67
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
correlation: qa-d8b372f9-77f1-4d4b-b057-ec30a186c40a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8b372f9-77f1-4d4b-b057-ec30a186c40a
Content-Type: application/json

--- request body ---
{"handle":"qa-c0986c2fc4c3","password":"****"}

--- response: 401 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d8b372f9-77f1-4d4b-b057-ec30a186c40a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d8b372f9-77f1-4d4b-b057-ec30a186c40a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-39da2eb6-bb42-4c88-b170-bde1cbe7b701

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39da2eb6-bb42-4c88-b170-bde1cbe7b701
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-39da2eb6-bb42-4c88-b170-bde1cbe7b701
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
correlation: qa-67b85390-5eff-4120-aef2-1948ec97659a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67b85390-5eff-4120-aef2-1948ec97659a
Content-Type: application/json

--- request body ---
{"handle":"qa-123e3bfc5888","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67b85390-5eff-4120-aef2-1948ec97659a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-67b85390-5eff-4120-aef2-1948ec97659a"}
```
