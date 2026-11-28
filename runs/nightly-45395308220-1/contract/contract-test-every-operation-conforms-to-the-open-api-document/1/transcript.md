# Transcript: Every operation in the OpenAPI document answers as documented (checked per response)

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#everyOperationConformsToTheOpenApiDocument` |
| Features | FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 23 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 360 | `qa-8a2fe265-f783-4047-b855-3612e587e9f3` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-cb9a8778-a78d-43cf-bd31-48aacf55f262` |
| 3 | `GET /health` | 200 | 41 | `qa-7ff96b03-e37e-4b8e-bad9-ebd172195f3b` |
| 4 | `POST /v1/auth/token` | 200 | 31 | `qa-8e642950-4fe4-4216-b534-d1e250464464` |
| 5 | `GET /v1/accounts/me` | 200 | 26 | `qa-f5a64882-bfba-4f78-bb0c-d613b54cb3bc` |
| 6 | `PATCH /v1/accounts/me` | 200 | 28 | `qa-61e2b238-88b8-4e34-9bdd-68847203efac` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 17 | `qa-ee984acd-5a2f-42a7-82f3-ef8eb382a38b` |
| 8 | `POST /v1/conversations` | 201 | 18 | `qa-ce84b8f3-66c7-4b48-b6f6-162e7445bead` |
| 9 | `GET /v1/conversations` | 200 | 5 | `qa-763aa6fd-77b2-4958-a50d-d1e12f14e828` |
| 10 | `POST /v1/auth/token` | 200 | 19 | `qa-d8142e8e-47ad-48e9-9c90-c24d3e9b9d7f` |
| 11 | `GET /v1/conversations/{id}` | 200 | 8 | `qa-20da546e-a1a5-401c-af3e-89a4aa277956` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 8 | `qa-0d605d97-314b-4c78-9885-7995acffe47f` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-8d572703-ba8a-4ca3-af81-289bbccbca0b` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 14 | `qa-d91ebf49-ff28-4a1e-832f-5e619985bd5e` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 8 | `qa-98ebce4f-aad3-4e17-83f6-b62bc145f48f` |
| 16 | `GET /v1/credits/balance` | 200 | 10 | `qa-0c309ad5-435b-4cd3-a73c-32ea4e17317a` |
| 17 | `GET /v1/credits/ledger` | 200 | 16 | `qa-8551d63e-d41d-40fb-b009-173603be55c1` |
| 18 | `POST /v1/credits/purchases` | 201 | 24 | `qa-f292984c-9ba2-4436-83a5-5cf8a8f81adb` |
| 19 | `GET /v1/admin/stats` | 403 | 22 | `qa-2ed3710e-f1ed-4c2d-a6e4-0b4befbadb1d` |
| 20 | `DELETE /v1/accounts/me` | 204 | 47 | `qa-2e6f5417-aa60-405f-9670-300538d8e445` |
| 21 | `POST /v1/auth/token` | 401 | 10 | `qa-daaaaa96-ef2b-4207-a93a-0cd1c10f5906` |
| 22 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-97313501-c955-48c6-8028-519154c164a5` |
| 23 | `POST /v1/auth/token` | 401 | 13 | `qa-5a9beb24-d5d4-4fb1-a268-9369ee75381c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8a2fe265-f783-4047-b855-3612e587e9f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a2fe265-f783-4047-b855-3612e587e9f3
Content-Type: application/json

--- request body ---
{"handle":"qa-998b3fb00b5c","displayName":"QA 998b3fb00b5c","password":"****","region":"eu"}

--- response: 201 in 360 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a2fe265-f783-4047-b855-3612e587e9f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-998b3fb00b5c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_068bfbd7-7ada-4867-9aa6-042fd2cbbeac","handle":"qa-998b3fb00b5c","displayName":"QA 998b3fb00b5c","region":"eu","role":"user","createdAt":"2026-11-24T12:38:12.230193943Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cb9a8778-a78d-43cf-bd31-48aacf55f262

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb9a8778-a78d-43cf-bd31-48aacf55f262
Content-Type: application/json

--- request body ---
{"handle":"qa-b8a72a3c751f","displayName":"QA b8a72a3c751f","password":"****","region":"us"}

--- response: 201 in 20 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb9a8778-a78d-43cf-bd31-48aacf55f262
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
Location: /v1/accounts/qa-b8a72a3c751f
X-Served-Region: us
Content-Length: 181

{"id":"acc_f4c11440-6aee-4d20-bcbd-3886d06d30b6","handle":"qa-b8a72a3c751f","displayName":"QA b8a72a3c751f","region":"us","role":"user","createdAt":"2026-11-24T12:38:12.618369036Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-7ff96b03-e37e-4b8e-bad9-ebd172195f3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ff96b03-e37e-4b8e-bad9-ebd172195f3b
Content-Type: application/json

--- response: 200 in 41 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ff96b03-e37e-4b8e-bad9-ebd172195f3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 95

{"status":"UP","version":"1.0.0","region":"eu","regions":["in","eu","us"],"faultsEnabled":true}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-8e642950-4fe4-4216-b534-d1e250464464

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e642950-4fe4-4216-b534-d1e250464464
Content-Type: application/json

--- request body ---
{"handle":"qa-998b3fb00b5c","password":"****"}

--- response: 200 in 31 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e642950-4fe4-4216-b534-d1e250464464
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_068bfbd7-7ada-4867-9aa6-042fd2cbbeac"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-f5a64882-bfba-4f78-bb0c-d613b54cb3bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5a64882-bfba-4f78-bb0c-d613b54cb3bc
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5a64882-bfba-4f78-bb0c-d613b54cb3bc
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

{"id":"acc_068bfbd7-7ada-4867-9aa6-042fd2cbbeac","handle":"qa-998b3fb00b5c","displayName":"QA 998b3fb00b5c","region":"eu","role":"user","createdAt":"2026-11-24T12:38:12.230193943Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-61e2b238-88b8-4e34-9bdd-68847203efac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61e2b238-88b8-4e34-9bdd-68847203efac
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 28 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-61e2b238-88b8-4e34-9bdd-68847203efac
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
Content-Length: 178

{"id":"acc_068bfbd7-7ada-4867-9aa6-042fd2cbbeac","handle":"qa-998b3fb00b5c","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-24T12:38:12.230193943Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-b8a72a3c751f
correlation: qa-ee984acd-5a2f-42a7-82f3-ef8eb382a38b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee984acd-5a2f-42a7-82f3-ef8eb382a38b
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee984acd-5a2f-42a7-82f3-ef8eb382a38b
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
Content-Length: 74

{"handle":"qa-b8a72a3c751f","displayName":"QA b8a72a3c751f","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-ce84b8f3-66c7-4b48-b6f6-162e7445bead

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce84b8f3-66c7-4b48-b6f6-162e7445bead
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b8a72a3c751f","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce84b8f3-66c7-4b48-b6f6-162e7445bead
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
X-Served-Region: eu
Location: /v1/conversations/cnv_08fc2298-5a5e-47af-8ba5-72573ac77052
X-Data-Region: us
Content-Length: 238

{"id":"cnv_08fc2298-5a5e-47af-8ba5-72573ac77052","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-998b3fb00b5c","qa-b8a72a3c751f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:12.906783801Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-763aa6fd-77b2-4958-a50d-d1e12f14e828

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-763aa6fd-77b2-4958-a50d-d1e12f14e828
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-763aa6fd-77b2-4958-a50d-d1e12f14e828
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
X-Served-Region: eu
Content-Length: 260

{"items":[{"id":"cnv_08fc2298-5a5e-47af-8ba5-72573ac77052","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-998b3fb00b5c","qa-b8a72a3c751f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:12.906783801Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-d8142e8e-47ad-48e9-9c90-c24d3e9b9d7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8142e8e-47ad-48e9-9c90-c24d3e9b9d7f
Content-Type: application/json

--- request body ---
{"handle":"qa-b8a72a3c751f","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8142e8e-47ad-48e9-9c90-c24d3e9b9d7f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f4c11440-6aee-4d20-bcbd-3886d06d30b6"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_08fc2298-5a5e-47af-8ba5-72573ac77052
correlation: qa-20da546e-a1a5-401c-af3e-89a4aa277956

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20da546e-a1a5-401c-af3e-89a4aa277956
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-20da546e-a1a5-401c-af3e-89a4aa277956
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
X-Served-Region: us
X-Data-Region: us
Content-Length: 238

{"id":"cnv_08fc2298-5a5e-47af-8ba5-72573ac77052","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-998b3fb00b5c","qa-b8a72a3c751f"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-24T12:38:12.906783801Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_08fc2298-5a5e-47af-8ba5-72573ac77052/messages
correlation: qa-0d605d97-314b-4c78-9885-7995acffe47f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d605d97-314b-4c78-9885-7995acffe47f
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d605d97-314b-4c78-9885-7995acffe47f
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
X-Served-Region: us
Content-Length: 215

{"items":[{"id":"msg_3586c2d2-86fa-4a0b-a231-b8e3c146620d","conversationId":"cnv_08fc2298-5a5e-47af-8ba5-72573ac77052","sender":"qa-998b3fb00b5c","body":"Hi","createdAt":"2026-11-24T12:38:12.906800593Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_08fc2298-5a5e-47af-8ba5-72573ac77052/messages
correlation: qa-8d572703-ba8a-4ca3-af81-289bbccbca0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d572703-ba8a-4ca3-af81-289bbccbca0b
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d572703-ba8a-4ca3-af81-289bbccbca0b
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
X-Served-Region: us
Content-Length: 196

{"id":"msg_e52b2bfd-ccae-4e6a-ac10-3427e529f207","conversationId":"cnv_08fc2298-5a5e-47af-8ba5-72573ac77052","sender":"qa-b8a72a3c751f","body":"Reply","createdAt":"2026-11-24T12:38:13.001992091Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_08fc2298-5a5e-47af-8ba5-72573ac77052/read
correlation: qa-d91ebf49-ff28-4a1e-832f-5e619985bd5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d91ebf49-ff28-4a1e-832f-5e619985bd5e
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-d91ebf49-ff28-4a1e-832f-5e619985bd5e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 77

{"conversationId":"cnv_08fc2298-5a5e-47af-8ba5-72573ac77052","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_08fc2298-5a5e-47af-8ba5-72573ac77052/close
correlation: qa-98ebce4f-aad3-4e17-83f6-b62bc145f48f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98ebce4f-aad3-4e17-83f6-b62bc145f48f
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-98ebce4f-aad3-4e17-83f6-b62bc145f48f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_08fc2298-5a5e-47af-8ba5-72573ac77052","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-998b3fb00b5c","qa-b8a72a3c751f"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-24T12:38:12.906783801Z","closedAt":"2026-11-24T12:38:13.040924945Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-0c309ad5-435b-4cd3-a73c-32ea4e17317a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c309ad5-435b-4cd3-a73c-32ea4e17317a
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c309ad5-435b-4cd3-a73c-32ea4e17317a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":4,"currency":"credits","accountId":"acc_068bfbd7-7ada-4867-9aa6-042fd2cbbeac"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-8551d63e-d41d-40fb-b009-173603be55c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8551d63e-d41d-40fb-b009-173603be55c1
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-8551d63e-d41d-40fb-b009-173603be55c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 393

{"items":[{"id":"led_10817f1f-430f-4998-b337-9dfb8ea1c827","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-24T12:38:12.230211580Z"},{"id":"led_90c29183-1531-435c-aaef-726011c49a17","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_08fc2298-5a5e-47af-8ba5-72573ac77052","createdAt":"2026-11-24T12:38:12.906757569Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f292984c-9ba2-4436-83a5-5cf8a8f81adb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-bd2c3a1b217f4634b16d9339e00b12ad
X-Correlation-Id: qa-f292984c-9ba2-4436-83a5-5cf8a8f81adb
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 24 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-f292984c-9ba2-4436-83a5-5cf8a8f81adb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/credits/purchases/pur_ce16b88b-39ad-4730-be50-3e732cdb5b37
Content-Length: 144

{"id":"pur_ce16b88b-39ad-4730-be50-3e732cdb5b37","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-24T12:38:13.116317676Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-2ed3710e-f1ed-4c2d-a6e4-0b4befbadb1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ed3710e-f1ed-4c2d-a6e4-0b4befbadb1d
Content-Type: application/json

--- response: 403 in 22 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ed3710e-f1ed-4c2d-a6e4-0b4befbadb1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-2ed3710e-f1ed-4c2d-a6e4-0b4befbadb1d"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2e6f5417-aa60-405f-9670-300538d8e445

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e6f5417-aa60-405f-9670-300538d8e445
Content-Type: application/json

--- response: 204 in 47 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2e6f5417-aa60-405f-9670-300538d8e445
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
X-Served-Region: us
```

## 21. POST /v1/auth/token

```text
#21 POST http://localhost:7070/v1/auth/token
correlation: qa-daaaaa96-ef2b-4207-a93a-0cd1c10f5906

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-daaaaa96-ef2b-4207-a93a-0cd1c10f5906
Content-Type: application/json

--- request body ---
{"handle":"qa-b8a72a3c751f","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-daaaaa96-ef2b-4207-a93a-0cd1c10f5906
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-daaaaa96-ef2b-4207-a93a-0cd1c10f5906"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-97313501-c955-48c6-8028-519154c164a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97313501-c955-48c6-8028-519154c164a5
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-97313501-c955-48c6-8028-519154c164a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
```

## 23. POST /v1/auth/token

```text
#23 POST http://localhost:7070/v1/auth/token
correlation: qa-5a9beb24-d5d4-4fb1-a268-9369ee75381c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a9beb24-d5d4-4fb1-a268-9369ee75381c
Content-Type: application/json

--- request body ---
{"handle":"qa-998b3fb00b5c","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a9beb24-d5d4-4fb1-a268-9369ee75381c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5a9beb24-d5d4-4fb1-a268-9369ee75381c"}
```
