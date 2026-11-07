# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-a2631088-8b90-4f9f-ad64-2b47848214d5` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-7c9003bd-d3c3-449a-8924-30eb7faa8638` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-6fb3468e-fa6b-4225-8873-5bdc39642c2a` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-b80a7e11-bd87-4fa5-a7c2-c62537fba27b` |
| 5 | `POST /v1/conversations` | 422 | 7 | `qa-997605d7-d97f-4b2c-9455-a709de8e23ce` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-b00fb54b-acb3-48a6-a3f9-80f1972e9d6e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-d144a4bb-c3f0-4a11-9f73-dc8295a63c12` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-a1841356-c594-45ce-bfe9-2560d0317e0e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-00e16d27-ba54-4fb2-871e-0c21867d5172` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-2bcc92a5-db62-4dff-a293-7a5eba36f9be` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a2631088-8b90-4f9f-ad64-2b47848214d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2631088-8b90-4f9f-ad64-2b47848214d5
Content-Type: application/json

--- request body ---
{"handle":"qa-0af3cfe89d6a","displayName":"QA 0af3cfe89d6a","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2631088-8b90-4f9f-ad64-2b47848214d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 8
Location: /v1/accounts/qa-0af3cfe89d6a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_24102234-76ec-47fc-8cca-ad82dadf60f6","handle":"qa-0af3cfe89d6a","displayName":"QA 0af3cfe89d6a","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.849040971Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7c9003bd-d3c3-449a-8924-30eb7faa8638

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c9003bd-d3c3-449a-8924-30eb7faa8638
Content-Type: application/json

--- request body ---
{"handle":"qa-f50fa2da9de7","displayName":"QA f50fa2da9de7","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c9003bd-d3c3-449a-8924-30eb7faa8638
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 8
Location: /v1/accounts/qa-f50fa2da9de7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f7bb3e3b-773d-458d-b7c3-34d8319864a4","handle":"qa-f50fa2da9de7","displayName":"QA f50fa2da9de7","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.889106449Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6fb3468e-fa6b-4225-8873-5bdc39642c2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fb3468e-fa6b-4225-8873-5bdc39642c2a
Content-Type: application/json

--- request body ---
{"handle":"qa-0af3cfe89d6a","password":"****"}

--- response: 200 in 26 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-6fb3468e-fa6b-4225-8873-5bdc39642c2a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24102234-76ec-47fc-8cca-ad82dadf60f6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b80a7e11-bd87-4fa5-a7c2-c62537fba27b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b80a7e11-bd87-4fa5-a7c2-c62537fba27b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f50fa2da9de7","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-b80a7e11-bd87-4fa5-a7c2-c62537fba27b
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
Location: /v1/conversations/cnv_3c3767f8-6c75-445a-a6e6-a151261bb504
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3c3767f8-6c75-445a-a6e6-a151261bb504","subject":"Error contract","status":"open","region":"eu","participants":["qa-0af3cfe89d6a","qa-f50fa2da9de7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:32.966384165Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-997605d7-d97f-4b2c-9455-a709de8e23ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-997605d7-d97f-4b2c-9455-a709de8e23ce
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f50fa2da9de7","subject":" ","message":"Hi"}

--- response: 422 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-997605d7-d97f-4b2c-9455-a709de8e23ce
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-997605d7-d97f-4b2c-9455-a709de8e23ce","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b00fb54b-acb3-48a6-a3f9-80f1972e9d6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b00fb54b-acb3-48a6-a3f9-80f1972e9d6e
Content-Type: application/json

--- request body ---
{"handle":"qa-f50fa2da9de7","password":"****"}

--- response: 200 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-b00fb54b-acb3-48a6-a3f9-80f1972e9d6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f7bb3e3b-773d-458d-b7c3-34d8319864a4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d144a4bb-c3f0-4a11-9f73-dc8295a63c12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d144a4bb-c3f0-4a11-9f73-dc8295a63c12
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d144a4bb-c3f0-4a11-9f73-dc8295a63c12
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
correlation: qa-a1841356-c594-45ce-bfe9-2560d0317e0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1841356-c594-45ce-bfe9-2560d0317e0e
Content-Type: application/json

--- request body ---
{"handle":"qa-f50fa2da9de7","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1841356-c594-45ce-bfe9-2560d0317e0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a1841356-c594-45ce-bfe9-2560d0317e0e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-00e16d27-ba54-4fb2-871e-0c21867d5172

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00e16d27-ba54-4fb2-871e-0c21867d5172
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-00e16d27-ba54-4fb2-871e-0c21867d5172
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
correlation: qa-2bcc92a5-db62-4dff-a293-7a5eba36f9be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bcc92a5-db62-4dff-a293-7a5eba36f9be
Content-Type: application/json

--- request body ---
{"handle":"qa-0af3cfe89d6a","password":"****"}

--- response: 401 in 19 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2bcc92a5-db62-4dff-a293-7a5eba36f9be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2bcc92a5-db62-4dff-a293-7a5eba36f9be"}
```
