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
| 1 | `POST /v1/accounts` | 201 | 64 | `qa-904a6625-a40e-4781-9f1c-4eaa043d7e9f` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-b97790b3-eda8-4926-b5f0-1a2c961a4349` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-1ede2f12-d8d5-421d-ac41-156a1b37e2b9` |
| 4 | `POST /v1/conversations` | 201 | 34 | `qa-4ae06fce-2092-41bc-a44d-a481913463ef` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 24 | `qa-5b4aaef0-2022-4540-97e7-cba89d772da0` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-d7b0dcab-965f-4a28-90db-5cb494c94bf5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-5deb9a72-dcd3-4b4a-85ec-305b65283ded` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-2d255020-a6ba-4400-a605-1b575b693ec8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-66999ca7-cc1d-4a7e-9aed-4b40bb6d21e2` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-90ff1cfe-3aa8-48dc-b61e-ffcd10d2f978` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-904a6625-a40e-4781-9f1c-4eaa043d7e9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-904a6625-a40e-4781-9f1c-4eaa043d7e9f
Content-Type: application/json

--- request body ---
{"handle":"qa-e2a1fb4eded4","displayName":"QA e2a1fb4eded4","password":"****","region":"eu"}

--- response: 201 in 64 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-904a6625-a40e-4781-9f1c-4eaa043d7e9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 7
Location: /v1/accounts/qa-e2a1fb4eded4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7852c0f4-8677-46e0-bed5-9042ab6e2175","handle":"qa-e2a1fb4eded4","displayName":"QA e2a1fb4eded4","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.795227938Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b97790b3-eda8-4926-b5f0-1a2c961a4349

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b97790b3-eda8-4926-b5f0-1a2c961a4349
Content-Type: application/json

--- request body ---
{"handle":"qa-8f80f7836904","displayName":"QA 8f80f7836904","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-b97790b3-eda8-4926-b5f0-1a2c961a4349
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 7
Location: /v1/accounts/qa-8f80f7836904
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9ff739c8-3ab8-4bac-be2b-799aceb61d1e","handle":"qa-8f80f7836904","displayName":"QA 8f80f7836904","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.861663019Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1ede2f12-d8d5-421d-ac41-156a1b37e2b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ede2f12-d8d5-421d-ac41-156a1b37e2b9
Content-Type: application/json

--- request body ---
{"handle":"qa-e2a1fb4eded4","password":"****"}

--- response: 200 in 34 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ede2f12-d8d5-421d-ac41-156a1b37e2b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7852c0f4-8677-46e0-bed5-9042ab6e2175"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4ae06fce-2092-41bc-a44d-a481913463ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ae06fce-2092-41bc-a44d-a481913463ef
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8f80f7836904","subject":"Error contract","message":"Hi"}

--- response: 201 in 34 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ae06fce-2092-41bc-a44d-a481913463ef
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
Location: /v1/conversations/cnv_e8a3977b-dc43-4e77-aceb-abe2497d6216
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e8a3977b-dc43-4e77-aceb-abe2497d6216","subject":"Error contract","status":"open","region":"eu","participants":["qa-e2a1fb4eded4","qa-8f80f7836904"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:38.988547267Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_e8a3977b-dc43-4e77-aceb-abe2497d6216/messages
correlation: qa-5b4aaef0-2022-4540-97e7-cba89d772da0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b4aaef0-2022-4540-97e7-cba89d772da0
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b4aaef0-2022-4540-97e7-cba89d772da0
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_e8a3977b-dc43-4e77-aceb-abe2497d6216/messages","correlationId":"qa-5b4aaef0-2022-4540-97e7-cba89d772da0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d7b0dcab-965f-4a28-90db-5cb494c94bf5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7b0dcab-965f-4a28-90db-5cb494c94bf5
Content-Type: application/json

--- request body ---
{"handle":"qa-8f80f7836904","password":"****"}

--- response: 200 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7b0dcab-965f-4a28-90db-5cb494c94bf5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9ff739c8-3ab8-4bac-be2b-799aceb61d1e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5deb9a72-dcd3-4b4a-85ec-305b65283ded

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5deb9a72-dcd3-4b4a-85ec-305b65283ded
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5deb9a72-dcd3-4b4a-85ec-305b65283ded
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
correlation: qa-2d255020-a6ba-4400-a605-1b575b693ec8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d255020-a6ba-4400-a605-1b575b693ec8
Content-Type: application/json

--- request body ---
{"handle":"qa-8f80f7836904","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d255020-a6ba-4400-a605-1b575b693ec8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2d255020-a6ba-4400-a605-1b575b693ec8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-66999ca7-cc1d-4a7e-9aed-4b40bb6d21e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66999ca7-cc1d-4a7e-9aed-4b40bb6d21e2
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-66999ca7-cc1d-4a7e-9aed-4b40bb6d21e2
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
correlation: qa-90ff1cfe-3aa8-48dc-b61e-ffcd10d2f978

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90ff1cfe-3aa8-48dc-b61e-ffcd10d2f978
Content-Type: application/json

--- request body ---
{"handle":"qa-e2a1fb4eded4","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90ff1cfe-3aa8-48dc-b61e-ffcd10d2f978
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-90ff1cfe-3aa8-48dc-b61e-ffcd10d2f978"}
```
