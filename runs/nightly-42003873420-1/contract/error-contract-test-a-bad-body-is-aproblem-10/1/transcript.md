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
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-7597e90e-9c5a-4b7e-a8b1-946b54c95f1d` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-79aad778-f6f1-48b3-a923-8c0cbfa2273f` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-45577b58-9bdf-48ff-8392-295f181e9e4e` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-bc735cec-b15a-4a54-8811-627202154853` |
| 5 | `POST /v1/conversations` | 415 | 30 | `qa-534a5b3f-d5cc-491b-a788-ddc0a9dcb285` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-38623522-cd3e-4f91-848c-a57eff55bb56` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-cf75de4b-c57a-497b-b4dc-f12741a79b24` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-a19a5cec-c326-4b25-964c-2cdbd495be25` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-63215d8c-e73d-4a3f-9b81-895780965f32` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-fba98d4a-f1cd-40df-af3c-4c30a9dcbc8e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7597e90e-9c5a-4b7e-a8b1-946b54c95f1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7597e90e-9c5a-4b7e-a8b1-946b54c95f1d
Content-Type: application/json

--- request body ---
{"handle":"qa-39f4b7525d17","displayName":"QA 39f4b7525d17","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-7597e90e-9c5a-4b7e-a8b1-946b54c95f1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 7
Location: /v1/accounts/qa-39f4b7525d17
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e1688a57-6073-4579-97ea-74506c63bc4c","handle":"qa-39f4b7525d17","displayName":"QA 39f4b7525d17","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.122343090Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-79aad778-f6f1-48b3-a923-8c0cbfa2273f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79aad778-f6f1-48b3-a923-8c0cbfa2273f
Content-Type: application/json

--- request body ---
{"handle":"qa-e3a2773e274c","displayName":"QA e3a2773e274c","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-79aad778-f6f1-48b3-a923-8c0cbfa2273f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 7
Location: /v1/accounts/qa-e3a2773e274c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_26c2c070-e8b3-439d-a7bd-a4a3175c3c94","handle":"qa-e3a2773e274c","displayName":"QA e3a2773e274c","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.161680961Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-45577b58-9bdf-48ff-8392-295f181e9e4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45577b58-9bdf-48ff-8392-295f181e9e4e
Content-Type: application/json

--- request body ---
{"handle":"qa-39f4b7525d17","password":"****"}

--- response: 200 in 22 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-45577b58-9bdf-48ff-8392-295f181e9e4e
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e1688a57-6073-4579-97ea-74506c63bc4c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bc735cec-b15a-4a54-8811-627202154853

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc735cec-b15a-4a54-8811-627202154853
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e3a2773e274c","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc735cec-b15a-4a54-8811-627202154853
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
Location: /v1/conversations/cnv_01e43c47-a092-4aca-b491-5d403fbff96d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_01e43c47-a092-4aca-b491-5d403fbff96d","subject":"Error contract","status":"open","region":"eu","participants":["qa-39f4b7525d17","qa-e3a2773e274c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:56.232308678Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-534a5b3f-d5cc-491b-a788-ddc0a9dcb285

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-534a5b3f-d5cc-491b-a788-ddc0a9dcb285
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-534a5b3f-d5cc-491b-a788-ddc0a9dcb285
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-534a5b3f-d5cc-491b-a788-ddc0a9dcb285"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-38623522-cd3e-4f91-848c-a57eff55bb56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38623522-cd3e-4f91-848c-a57eff55bb56
Content-Type: application/json

--- request body ---
{"handle":"qa-e3a2773e274c","password":"****"}

--- response: 200 in 27 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-38623522-cd3e-4f91-848c-a57eff55bb56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_26c2c070-e8b3-439d-a7bd-a4a3175c3c94"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cf75de4b-c57a-497b-b4dc-f12741a79b24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf75de4b-c57a-497b-b4dc-f12741a79b24
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cf75de4b-c57a-497b-b4dc-f12741a79b24
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
correlation: qa-a19a5cec-c326-4b25-964c-2cdbd495be25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a19a5cec-c326-4b25-964c-2cdbd495be25
Content-Type: application/json

--- request body ---
{"handle":"qa-e3a2773e274c","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a19a5cec-c326-4b25-964c-2cdbd495be25
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a19a5cec-c326-4b25-964c-2cdbd495be25"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-63215d8c-e73d-4a3f-9b81-895780965f32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63215d8c-e73d-4a3f-9b81-895780965f32
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-63215d8c-e73d-4a3f-9b81-895780965f32
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
correlation: qa-fba98d4a-f1cd-40df-af3c-4c30a9dcbc8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fba98d4a-f1cd-40df-af3c-4c30a9dcbc8e
Content-Type: application/json

--- request body ---
{"handle":"qa-39f4b7525d17","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fba98d4a-f1cd-40df-af3c-4c30a9dcbc8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fba98d4a-f1cd-40df-af3c-4c30a9dcbc8e"}
```
