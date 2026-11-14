# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-1c793803-4e60-4e99-9e8f-34fbef27fb07` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-cd99a48c-0370-4881-8dcc-f9dd7d9c159f` |
| 3 | `POST /v1/auth/token` | 200 | 60 | `qa-c41b339c-139b-4f3e-b080-1216dfafc54d` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-892be735-2dfa-4fea-983d-0c73fd360095` |
| 5 | `POST /v1/accounts` | 415 | 17 | `qa-2d86b2b8-075d-45b4-8136-0541162bd28e` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-b25f7331-fbed-4d16-ac26-49cd566d4659` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-c0ff27d1-9685-460c-bb63-b4f30bc2343a` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-9f049eac-4428-46df-a3c6-4dd918bfd390` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-23cccad1-32f4-4fa7-8c4d-87c70fbf2e34` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-7b5c2bc8-edc1-4e8b-b43b-8c82268f13b9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1c793803-4e60-4e99-9e8f-34fbef27fb07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c793803-4e60-4e99-9e8f-34fbef27fb07
Content-Type: application/json

--- request body ---
{"handle":"qa-0cd072e1ee6b","displayName":"QA 0cd072e1ee6b","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c793803-4e60-4e99-9e8f-34fbef27fb07
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 8
Location: /v1/accounts/qa-0cd072e1ee6b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3bbb5f0d-9617-4467-9681-255243c3557f","handle":"qa-0cd072e1ee6b","displayName":"QA 0cd072e1ee6b","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.274290550Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cd99a48c-0370-4881-8dcc-f9dd7d9c159f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd99a48c-0370-4881-8dcc-f9dd7d9c159f
Content-Type: application/json

--- request body ---
{"handle":"qa-c1e714e0ab4b","displayName":"QA c1e714e0ab4b","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd99a48c-0370-4881-8dcc-f9dd7d9c159f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 8
Location: /v1/accounts/qa-c1e714e0ab4b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_14addbda-63c3-4a15-958a-d23e40e1ecd0","handle":"qa-c1e714e0ab4b","displayName":"QA c1e714e0ab4b","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.324024345Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c41b339c-139b-4f3e-b080-1216dfafc54d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c41b339c-139b-4f3e-b080-1216dfafc54d
Content-Type: application/json

--- request body ---
{"handle":"qa-0cd072e1ee6b","password":"****"}

--- response: 200 in 60 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-c41b339c-139b-4f3e-b080-1216dfafc54d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3bbb5f0d-9617-4467-9681-255243c3557f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-892be735-2dfa-4fea-983d-0c73fd360095

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-892be735-2dfa-4fea-983d-0c73fd360095
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c1e714e0ab4b","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-892be735-2dfa-4fea-983d-0c73fd360095
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
Location: /v1/conversations/cnv_95ba8e49-35bf-425d-94b7-26e2914bd787
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_95ba8e49-35bf-425d-94b7-26e2914bd787","subject":"Error contract","status":"open","region":"eu","participants":["qa-0cd072e1ee6b","qa-c1e714e0ab4b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:36.426805761Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-2d86b2b8-075d-45b4-8136-0541162bd28e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d86b2b8-075d-45b4-8136-0541162bd28e
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d86b2b8-075d-45b4-8136-0541162bd28e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 8
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-2d86b2b8-075d-45b4-8136-0541162bd28e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b25f7331-fbed-4d16-ac26-49cd566d4659

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b25f7331-fbed-4d16-ac26-49cd566d4659
Content-Type: application/json

--- request body ---
{"handle":"qa-c1e714e0ab4b","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b25f7331-fbed-4d16-ac26-49cd566d4659
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_14addbda-63c3-4a15-958a-d23e40e1ecd0"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c0ff27d1-9685-460c-bb63-b4f30bc2343a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0ff27d1-9685-460c-bb63-b4f30bc2343a
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c0ff27d1-9685-460c-bb63-b4f30bc2343a
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
correlation: qa-9f049eac-4428-46df-a3c6-4dd918bfd390

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f049eac-4428-46df-a3c6-4dd918bfd390
Content-Type: application/json

--- request body ---
{"handle":"qa-c1e714e0ab4b","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f049eac-4428-46df-a3c6-4dd918bfd390
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9f049eac-4428-46df-a3c6-4dd918bfd390"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-23cccad1-32f4-4fa7-8c4d-87c70fbf2e34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23cccad1-32f4-4fa7-8c4d-87c70fbf2e34
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-23cccad1-32f4-4fa7-8c4d-87c70fbf2e34
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
correlation: qa-7b5c2bc8-edc1-4e8b-b43b-8c82268f13b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b5c2bc8-edc1-4e8b-b43b-8c82268f13b9
Content-Type: application/json

--- request body ---
{"handle":"qa-0cd072e1ee6b","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b5c2bc8-edc1-4e8b-b43b-8c82268f13b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7b5c2bc8-edc1-4e8b-b43b-8c82268f13b9"}
```
