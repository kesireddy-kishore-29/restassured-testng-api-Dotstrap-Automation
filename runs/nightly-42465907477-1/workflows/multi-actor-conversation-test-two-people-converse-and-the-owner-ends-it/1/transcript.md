# Transcript: Two people exchange messages; an outsider is kept out; closing stops the thread

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiActorConversationTest#twoPeopleConverseAndTheOwnerEndsIt` |
| Features | FEAT-CONV-01, FEAT-CONV-02, FEAT-CONV-03, FEAT-AUTHZ-01, FEAT-REGION-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 33 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 354 | `qa-5a8aa6c9-665f-439f-9414-38b1012794e8` |
| 2 | `POST /v1/accounts` | 201 | 56 | `qa-1dcb4f01-be6b-430c-9472-cb0d3f7211a3` |
| 3 | `POST /v1/accounts` | 201 | 32 | `qa-109b8c4b-2f3d-4610-a8dc-b37f93828dc8` |
| 4 | `POST /v1/auth/token` | 200 | 20 | `qa-7183e231-9d7b-4f9c-94c8-4b59d789b357` |
| 5 | `POST /v1/conversations` | 201 | 67 | `qa-cf68ebe0-2043-486c-963b-5942ea3700f5` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-c2ea6564-8726-4a6c-996f-0d697aee2116` |
| 7 | `GET /v1/conversations` | 200 | 27 | `qa-201c74e9-1b17-4bdd-af7f-c6128e72e92b` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 18 | `qa-e18c4871-7cab-45a0-8e87-695e896533e5` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 8 | `qa-19087614-c019-4444-8d4a-40fad4e9ab96` |
| 10 | `GET /v1/conversations/{id}` | 200 | 6 | `qa-8e17ab19-9af4-4b1f-adcf-185757f9b351` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 15 | `qa-29eba4cd-e1a1-4af6-af40-0db66393c0f7` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 9 | `qa-b4ac7829-ccf9-4f6e-9d26-f88bb16f146d` |
| 13 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-f6afc44a-f8c2-4817-8cc3-546425fb2a4e` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 6 | `qa-66f654a8-8dbf-4a2e-a125-735c4977f836` |
| 15 | `GET /v1/credits/balance` | 200 | 8 | `qa-c0479a3f-7136-4d24-b32a-36e9296ae4cc` |
| 16 | `GET /v1/credits/balance` | 200 | 15 | `qa-3131b1c2-debd-43ee-81df-c251691ca3cc` |
| 17 | `POST /v1/auth/token` | 200 | 18 | `qa-69dc6592-3323-4a79-b12e-d60d03727bfd` |
| 18 | `GET /v1/conversations/{id}` | 403 | 8 | `qa-c839cdb6-6710-42f9-8ad8-733235df93fe` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 8 | `qa-010c771d-be58-4df9-8046-8f358c391921` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 7 | `qa-44ea8430-e81e-4e32-8591-75bb91029afe` |
| 21 | `GET /v1/conversations` | 200 | 23 | `qa-1e583e77-4202-45cb-8eb0-0f1be37d053f` |
| 22 | `GET /v1/credits/balance` | 200 | 8 | `qa-b374defd-8417-44e5-a0a6-a92f2f95d736` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 14 | `qa-e45adc7b-2854-441c-b982-17268fd6b3b7` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 8 | `qa-88db8e56-54f8-460f-8ce1-5ad605e7c247` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 8 | `qa-427c67d4-c2fc-4acb-a1a5-1c10dc7a8331` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 9 | `qa-a181aa9a-ae78-4ed7-8936-d68ac5cb04ba` |
| 27 | `GET /v1/credits/balance` | 200 | 12 | `qa-9e479e75-1c00-47a2-b41f-4fe10c42cb63` |
| 28 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-823744de-48a7-481c-ae3f-c52a439197b5` |
| 29 | `POST /v1/auth/token` | 401 | 6 | `qa-053f423c-de07-4b16-a641-b8128a914f34` |
| 30 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-0d837c9c-66e0-467f-952a-c5fdd20a66a0` |
| 31 | `POST /v1/auth/token` | 401 | 4 | `qa-ad6cb975-7eb0-4483-888a-f4640b5676c5` |
| 32 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-79b59976-6b26-4393-b5a0-a1c219a6f958` |
| 33 | `POST /v1/auth/token` | 401 | 7 | `qa-93c9485c-1ee1-423b-9e77-e0b565e0bf38` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5a8aa6c9-665f-439f-9414-38b1012794e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a8aa6c9-665f-439f-9414-38b1012794e8
Content-Type: application/json

--- request body ---
{"handle":"qa-4d07a7605777","displayName":"QA 4d07a7605777","password":"****","region":"eu"}

--- response: 201 in 354 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a8aa6c9-665f-439f-9414-38b1012794e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-4d07a7605777
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3c7a2586-985f-4ea0-aa9f-ff84e51375d1","handle":"qa-4d07a7605777","displayName":"QA 4d07a7605777","region":"eu","role":"user","createdAt":"2026-11-08T09:09:09.474461055Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1dcb4f01-be6b-430c-9472-cb0d3f7211a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1dcb4f01-be6b-430c-9472-cb0d3f7211a3
Content-Type: application/json

--- request body ---
{"handle":"qa-1a2724e4685e","displayName":"QA 1a2724e4685e","password":"****","region":"us"}

--- response: 201 in 56 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-1dcb4f01-be6b-430c-9472-cb0d3f7211a3
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
Location: /v1/accounts/qa-1a2724e4685e
X-Served-Region: us
Content-Length: 181

{"id":"acc_d0025ec9-9b41-410f-84e0-d0a10ffc1f76","handle":"qa-1a2724e4685e","displayName":"QA 1a2724e4685e","region":"us","role":"user","createdAt":"2026-11-08T09:09:09.827212709Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-109b8c4b-2f3d-4610-a8dc-b37f93828dc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-109b8c4b-2f3d-4610-a8dc-b37f93828dc8
Content-Type: application/json

--- request body ---
{"handle":"qa-4fd509925be9","displayName":"QA 4fd509925be9","password":"****","region":"in"}

--- response: 201 in 32 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-109b8c4b-2f3d-4610-a8dc-b37f93828dc8
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
Location: /v1/accounts/qa-4fd509925be9
X-Served-Region: in
Content-Length: 181

{"id":"acc_e40a751f-9980-455c-bf27-d36efb3727ba","handle":"qa-4fd509925be9","displayName":"QA 4fd509925be9","region":"in","role":"user","createdAt":"2026-11-08T09:09:09.883079216Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-7183e231-9d7b-4f9c-94c8-4b59d789b357

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7183e231-9d7b-4f9c-94c8-4b59d789b357
Content-Type: application/json

--- request body ---
{"handle":"qa-4d07a7605777","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-7183e231-9d7b-4f9c-94c8-4b59d789b357
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3c7a2586-985f-4ea0-aa9f-ff84e51375d1"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-cf68ebe0-2043-486c-963b-5942ea3700f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf68ebe0-2043-486c-963b-5942ea3700f5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1a2724e4685e","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 67 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf68ebe0-2043-486c-963b-5942ea3700f5
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
Location: /v1/conversations/cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b
X-Data-Region: us
Content-Length: 238

{"id":"cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b","subject":"Project kickoff","status":"open","region":"us","participants":["qa-4d07a7605777","qa-1a2724e4685e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:09.975157845Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c2ea6564-8726-4a6c-996f-0d697aee2116

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2ea6564-8726-4a6c-996f-0d697aee2116
Content-Type: application/json

--- request body ---
{"handle":"qa-1a2724e4685e","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2ea6564-8726-4a6c-996f-0d697aee2116
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d0025ec9-9b41-410f-84e0-d0a10ffc1f76"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-201c74e9-1b17-4bdd-af7f-c6128e72e92b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-201c74e9-1b17-4bdd-af7f-c6128e72e92b
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-201c74e9-1b17-4bdd-af7f-c6128e72e92b
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
Content-Length: 260

{"items":[{"id":"cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b","subject":"Project kickoff","status":"open","region":"us","participants":["qa-4d07a7605777","qa-1a2724e4685e"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-08T09:09:09.975157845Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b/messages
correlation: qa-e18c4871-7cab-45a0-8e87-695e896533e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e18c4871-7cab-45a0-8e87-695e896533e5
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-e18c4871-7cab-45a0-8e87-695e896533e5
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
Content-Length: 234

{"items":[{"id":"msg_cf505ecb-2b3f-456a-98af-60f707a742b0","conversationId":"cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b","sender":"qa-4d07a7605777","body":"Hi Ben, got a minute?","createdAt":"2026-11-08T09:09:09.975380431Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b/read
correlation: qa-19087614-c019-4444-8d4a-40fad4e9ab96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19087614-c019-4444-8d4a-40fad4e9ab96
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-19087614-c019-4444-8d4a-40fad4e9ab96
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
Content-Length: 77

{"conversationId":"cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b
correlation: qa-8e17ab19-9af4-4b1f-adcf-185757f9b351

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e17ab19-9af4-4b1f-adcf-185757f9b351
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e17ab19-9af4-4b1f-adcf-185757f9b351
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
X-Data-Region: us
Content-Length: 238

{"id":"cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b","subject":"Project kickoff","status":"open","region":"us","participants":["qa-4d07a7605777","qa-1a2724e4685e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:09.975157845Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b/messages
correlation: qa-29eba4cd-e1a1-4af6-af40-0db66393c0f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29eba4cd-e1a1-4af6-af40-0db66393c0f7
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-29eba4cd-e1a1-4af6-af40-0db66393c0f7
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
X-Served-Region: us
Content-Length: 206

{"id":"msg_e6956cf4-d7bd-440d-8731-ab394dd70490","conversationId":"cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b","sender":"qa-1a2724e4685e","body":"Sure, now works","createdAt":"2026-11-08T09:09:10.374310123Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b/messages
correlation: qa-b4ac7829-ccf9-4f6e-9d26-f88bb16f146d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4ac7829-ccf9-4f6e-9d26-f88bb16f146d
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4ac7829-ccf9-4f6e-9d26-f88bb16f146d
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
X-Served-Region: us
Content-Length: 202

{"id":"msg_7a743634-67fc-42b4-946c-3a512b561be2","conversationId":"cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b","sender":"qa-1a2724e4685e","body":"Calling you","createdAt":"2026-11-08T09:09:10.390578898Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b
correlation: qa-f6afc44a-f8c2-4817-8cc3-546425fb2a4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6afc44a-f8c2-4817-8cc3-546425fb2a4e
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6afc44a-f8c2-4817-8cc3-546425fb2a4e
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
X-Data-Region: us
Content-Length: 238

{"id":"cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b","subject":"Project kickoff","status":"open","region":"us","participants":["qa-4d07a7605777","qa-1a2724e4685e"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-08T09:09:09.975157845Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b/messages
correlation: qa-66f654a8-8dbf-4a2e-a125-735c4977f836

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66f654a8-8dbf-4a2e-a125-735c4977f836
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-66f654a8-8dbf-4a2e-a125-735c4977f836
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
Content-Length: 644

{"items":[{"id":"msg_cf505ecb-2b3f-456a-98af-60f707a742b0","conversationId":"cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b","sender":"qa-4d07a7605777","body":"Hi Ben, got a minute?","createdAt":"2026-11-08T09:09:09.975380431Z"},{"id":"msg_e6956cf4-d7bd-440d-8731-ab394dd70490","conversationId":"cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b","sender":"qa-1a2724e4685e","body":"Sure, now works","createdAt":"2026-11-08T09:09:10.374310123Z"},{"id":"msg_7a743634-67fc-42b4-946c-3a512b561be2","conversationId":"cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b","sender":"qa-1a2724e4685e","body":"Calling you","createdAt":"2026-11-08T09:09:10.390578898Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-c0479a3f-7136-4d24-b32a-36e9296ae4cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0479a3f-7136-4d24-b32a-36e9296ae4cc
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0479a3f-7136-4d24-b32a-36e9296ae4cc
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
Content-Length: 89

{"balance":4,"currency":"credits","accountId":"acc_3c7a2586-985f-4ea0-aa9f-ff84e51375d1"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-3131b1c2-debd-43ee-81df-c251691ca3cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3131b1c2-debd-43ee-81df-c251691ca3cc
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-3131b1c2-debd-43ee-81df-c251691ca3cc
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
X-Served-Region: us
Content-Length: 89

{"balance":3,"currency":"credits","accountId":"acc_d0025ec9-9b41-410f-84e0-d0a10ffc1f76"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-69dc6592-3323-4a79-b12e-d60d03727bfd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69dc6592-3323-4a79-b12e-d60d03727bfd
Content-Type: application/json

--- request body ---
{"handle":"qa-4fd509925be9","password":"****"}

--- response: 200 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-69dc6592-3323-4a79-b12e-d60d03727bfd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e40a751f-9980-455c-bf27-d36efb3727ba"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b
correlation: qa-c839cdb6-6710-42f9-8ad8-733235df93fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c839cdb6-6710-42f9-8ad8-733235df93fe
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c839cdb6-6710-42f9-8ad8-733235df93fe
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b","correlationId":"qa-c839cdb6-6710-42f9-8ad8-733235df93fe"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b/messages
correlation: qa-010c771d-be58-4df9-8046-8f358c391921

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-010c771d-be58-4df9-8046-8f358c391921
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-010c771d-be58-4df9-8046-8f358c391921
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b/messages","correlationId":"qa-010c771d-be58-4df9-8046-8f358c391921"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b/messages
correlation: qa-44ea8430-e81e-4e32-8591-75bb91029afe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44ea8430-e81e-4e32-8591-75bb91029afe
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-44ea8430-e81e-4e32-8591-75bb91029afe
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b/messages","correlationId":"qa-44ea8430-e81e-4e32-8591-75bb91029afe"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-1e583e77-4202-45cb-8eb0-0f1be37d053f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e583e77-4202-45cb-8eb0-0f1be37d053f
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e583e77-4202-45cb-8eb0-0f1be37d053f
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
X-Served-Region: in
Content-Length: 22

{"items":[],"total":0}
```

## 22. GET /v1/credits/balance

```text
#22 GET http://localhost:7070/v1/credits/balance
correlation: qa-b374defd-8417-44e5-a0a6-a92f2f95d736

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b374defd-8417-44e5-a0a6-a92f2f95d736
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-b374defd-8417-44e5-a0a6-a92f2f95d736
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
X-Served-Region: in
Content-Length: 89

{"balance":5,"currency":"credits","accountId":"acc_e40a751f-9980-455c-bf27-d36efb3727ba"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b/close
correlation: qa-e45adc7b-2854-441c-b982-17268fd6b3b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e45adc7b-2854-441c-b982-17268fd6b3b7
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-e45adc7b-2854-441c-b982-17268fd6b3b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-4d07a7605777","qa-1a2724e4685e"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-08T09:09:09.975157845Z","closedAt":"2026-11-08T09:09:11.177944038Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b/close
correlation: qa-88db8e56-54f8-460f-8ce1-5ad605e7c247

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88db8e56-54f8-460f-8ce1-5ad605e7c247
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-88db8e56-54f8-460f-8ce1-5ad605e7c247
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-4d07a7605777","qa-1a2724e4685e"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-08T09:09:09.975157845Z","closedAt":"2026-11-08T09:09:11.177944038Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b/messages
correlation: qa-427c67d4-c2fc-4acb-a1a5-1c10dc7a8331

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-427c67d4-c2fc-4acb-a1a5-1c10dc7a8331
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-427c67d4-c2fc-4acb-a1a5-1c10dc7a8331
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
X-Served-Region: us
Content-Length: 644

{"items":[{"id":"msg_cf505ecb-2b3f-456a-98af-60f707a742b0","conversationId":"cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b","sender":"qa-4d07a7605777","body":"Hi Ben, got a minute?","createdAt":"2026-11-08T09:09:09.975380431Z"},{"id":"msg_e6956cf4-d7bd-440d-8731-ab394dd70490","conversationId":"cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b","sender":"qa-1a2724e4685e","body":"Sure, now works","createdAt":"2026-11-08T09:09:10.374310123Z"},{"id":"msg_7a743634-67fc-42b4-946c-3a512b561be2","conversationId":"cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b","sender":"qa-1a2724e4685e","body":"Calling you","createdAt":"2026-11-08T09:09:10.390578898Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b/messages
correlation: qa-a181aa9a-ae78-4ed7-8936-d68ac5cb04ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a181aa9a-ae78-4ed7-8936-d68ac5cb04ba
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a181aa9a-ae78-4ed7-8936-d68ac5cb04ba
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
X-Served-Region: us
Content-Length: 329

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_4c1eb52c-ddf2-44c5-b0b6-8f47f7e5ad2b/messages","correlationId":"qa-a181aa9a-ae78-4ed7-8936-d68ac5cb04ba"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-9e479e75-1c00-47a2-b41f-4fe10c42cb63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e479e75-1c00-47a2-b41f-4fe10c42cb63
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e479e75-1c00-47a2-b41f-4fe10c42cb63
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 9
X-Served-Region: us
Content-Length: 89

{"balance":3,"currency":"credits","accountId":"acc_d0025ec9-9b41-410f-84e0-d0a10ffc1f76"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-823744de-48a7-481c-ae3f-c52a439197b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-823744de-48a7-481c-ae3f-c52a439197b5
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-823744de-48a7-481c-ae3f-c52a439197b5
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
X-Served-Region: in
```

## 29. POST /v1/auth/token

```text
#29 POST http://localhost:7070/v1/auth/token
correlation: qa-053f423c-de07-4b16-a641-b8128a914f34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-053f423c-de07-4b16-a641-b8128a914f34
Content-Type: application/json

--- request body ---
{"handle":"qa-4fd509925be9","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-053f423c-de07-4b16-a641-b8128a914f34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-053f423c-de07-4b16-a641-b8128a914f34"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0d837c9c-66e0-467f-952a-c5fdd20a66a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d837c9c-66e0-467f-952a-c5fdd20a66a0
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0d837c9c-66e0-467f-952a-c5fdd20a66a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 9
X-Served-Region: us
```

## 31. POST /v1/auth/token

```text
#31 POST http://localhost:7070/v1/auth/token
correlation: qa-ad6cb975-7eb0-4483-888a-f4640b5676c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad6cb975-7eb0-4483-888a-f4640b5676c5
Content-Type: application/json

--- request body ---
{"handle":"qa-1a2724e4685e","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad6cb975-7eb0-4483-888a-f4640b5676c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ad6cb975-7eb0-4483-888a-f4640b5676c5"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-79b59976-6b26-4393-b5a0-a1c219a6f958

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79b59976-6b26-4393-b5a0-a1c219a6f958
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-79b59976-6b26-4393-b5a0-a1c219a6f958
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 9
X-Served-Region: eu
```

## 33. POST /v1/auth/token

```text
#33 POST http://localhost:7070/v1/auth/token
correlation: qa-93c9485c-1ee1-423b-9e77-e0b565e0bf38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93c9485c-1ee1-423b-9e77-e0b565e0bf38
Content-Type: application/json

--- request body ---
{"handle":"qa-4d07a7605777","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93c9485c-1ee1-423b-9e77-e0b565e0bf38
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-93c9485c-1ee1-423b-9e77-e0b565e0bf38"}
```
