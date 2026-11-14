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
| 1 | `POST /v1/accounts` | 201 | 515 | `qa-f615586f-b3aa-4e1b-bd4a-759a6d460e7b` |
| 2 | `POST /v1/accounts` | 201 | 59 | `qa-62d20390-59b2-4f1b-9d2b-468c185085b1` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-49b1ef85-51bd-4f47-ba2d-1be079c59982` |
| 4 | `POST /v1/conversations` | 201 | 136 | `qa-cb859ebb-0ac3-4444-a3a0-0b82829d81e8` |
| 5 | `GET /v1/conversations/{id}` | 200 | 18 | `qa-66acb450-4e2d-43ab-a71d-76b9aea00216` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-bcc66ce5-f30b-45d9-a61f-49c9187b2971` |
| 7 | `GET /v1/conversations/{id}` | 200 | 9 | `qa-767539c2-f0a9-42b6-948a-96a5a33a2221` |
| 8 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-45b1c195-5d6c-41eb-845e-72aec76180a1` |
| 9 | `POST /v1/auth/token` | 401 | 11 | `qa-c67c17db-ac49-4421-a597-c92f8d8b41b3` |
| 10 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-79d78478-42dc-4e55-9a6c-e55050b8b363` |
| 11 | `POST /v1/auth/token` | 401 | 14 | `qa-2728a61d-ae34-40ea-b965-c5a3f4e27b15` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f615586f-b3aa-4e1b-bd4a-759a6d460e7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f615586f-b3aa-4e1b-bd4a-759a6d460e7b
Content-Type: application/json

--- request body ---
{"handle":"qa-222645ddebb8","displayName":"QA 222645ddebb8","password":"****","region":"in"}

--- response: 201 in 515 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-f615586f-b3aa-4e1b-bd4a-759a6d460e7b
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
Location: /v1/accounts/qa-222645ddebb8
X-Served-Region: in
Content-Length: 181

{"id":"acc_afa889d7-f957-4293-9a68-50baaeeb16e5","handle":"qa-222645ddebb8","displayName":"QA 222645ddebb8","region":"in","role":"user","createdAt":"2026-11-05T09:37:56.241554739Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-62d20390-59b2-4f1b-9d2b-468c185085b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62d20390-59b2-4f1b-9d2b-468c185085b1
Content-Type: application/json

--- request body ---
{"handle":"qa-2ada9019bfb3","displayName":"QA 2ada9019bfb3","password":"****","region":"eu"}

--- response: 201 in 59 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-62d20390-59b2-4f1b-9d2b-468c185085b1
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
Location: /v1/accounts/qa-2ada9019bfb3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f62328db-489b-4560-bf46-dc1572e1732d","handle":"qa-2ada9019bfb3","displayName":"QA 2ada9019bfb3","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.815192997Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-49b1ef85-51bd-4f47-ba2d-1be079c59982

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49b1ef85-51bd-4f47-ba2d-1be079c59982
Content-Type: application/json

--- request body ---
{"handle":"qa-222645ddebb8","password":"****"}

--- response: 200 in 22 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-49b1ef85-51bd-4f47-ba2d-1be079c59982
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_afa889d7-f957-4293-9a68-50baaeeb16e5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cb859ebb-0ac3-4444-a3a0-0b82829d81e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb859ebb-0ac3-4444-a3a0-0b82829d81e8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2ada9019bfb3","subject":"Across regions","message":"Namaste"}

--- response: 201 in 136 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb859ebb-0ac3-4444-a3a0-0b82829d81e8
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
Location: /v1/conversations/cnv_0725c2ee-dc60-46fc-b294-0d637ee96974
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0725c2ee-dc60-46fc-b294-0d637ee96974","subject":"Across regions","status":"open","region":"eu","participants":["qa-222645ddebb8","qa-2ada9019bfb3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:57.034525144Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_0725c2ee-dc60-46fc-b294-0d637ee96974
correlation: qa-66acb450-4e2d-43ab-a71d-76b9aea00216

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66acb450-4e2d-43ab-a71d-76b9aea00216
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-66acb450-4e2d-43ab-a71d-76b9aea00216
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

{"id":"cnv_0725c2ee-dc60-46fc-b294-0d637ee96974","subject":"Across regions","status":"open","region":"eu","participants":["qa-222645ddebb8","qa-2ada9019bfb3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:57.034525144Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bcc66ce5-f30b-45d9-a61f-49c9187b2971

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcc66ce5-f30b-45d9-a61f-49c9187b2971
Content-Type: application/json

--- request body ---
{"handle":"qa-2ada9019bfb3","password":"****"}

--- response: 200 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcc66ce5-f30b-45d9-a61f-49c9187b2971
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f62328db-489b-4560-bf46-dc1572e1732d"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_0725c2ee-dc60-46fc-b294-0d637ee96974
correlation: qa-767539c2-f0a9-42b6-948a-96a5a33a2221

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-767539c2-f0a9-42b6-948a-96a5a33a2221
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-767539c2-f0a9-42b6-948a-96a5a33a2221
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

{"id":"cnv_0725c2ee-dc60-46fc-b294-0d637ee96974","subject":"Across regions","status":"open","region":"eu","participants":["qa-222645ddebb8","qa-2ada9019bfb3"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-05T09:37:57.034525144Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-45b1c195-5d6c-41eb-845e-72aec76180a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45b1c195-5d6c-41eb-845e-72aec76180a1
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-45b1c195-5d6c-41eb-845e-72aec76180a1
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
correlation: qa-c67c17db-ac49-4421-a597-c92f8d8b41b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c67c17db-ac49-4421-a597-c92f8d8b41b3
Content-Type: application/json

--- request body ---
{"handle":"qa-2ada9019bfb3","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c67c17db-ac49-4421-a597-c92f8d8b41b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c67c17db-ac49-4421-a597-c92f8d8b41b3"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-79d78478-42dc-4e55-9a6c-e55050b8b363

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79d78478-42dc-4e55-9a6c-e55050b8b363
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-79d78478-42dc-4e55-9a6c-e55050b8b363
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
correlation: qa-2728a61d-ae34-40ea-b965-c5a3f4e27b15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2728a61d-ae34-40ea-b965-c5a3f4e27b15
Content-Type: application/json

--- request body ---
{"handle":"qa-222645ddebb8","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2728a61d-ae34-40ea-b965-c5a3f4e27b15
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2728a61d-ae34-40ea-b965-c5a3f4e27b15"}
```
