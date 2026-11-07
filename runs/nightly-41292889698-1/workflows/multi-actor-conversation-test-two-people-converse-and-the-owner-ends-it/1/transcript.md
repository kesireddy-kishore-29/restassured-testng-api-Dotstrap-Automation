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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-b3c99826-d337-4a4a-9487-c85aab338f34` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-2fe5b6d2-abe2-4e1e-ac56-25652b502b43` |
| 3 | `POST /v1/accounts` | 201 | 12 | `qa-b9443147-3620-471a-b452-58b4568ea629` |
| 4 | `POST /v1/auth/token` | 200 | 10 | `qa-0034f8fc-f43b-4e8f-a037-07b418d4dc21` |
| 5 | `POST /v1/conversations` | 201 | 8 | `qa-c28f6698-cc33-424b-838e-8681d30713d0` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-81f2d55f-6ded-4ae1-a945-337a7c45b007` |
| 7 | `GET /v1/conversations` | 200 | 14 | `qa-e9ab6652-1888-4824-8ce9-f35e4e22cf52` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 12 | `qa-08643074-51de-4ccc-98b9-ba8147a5ad9d` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 19 | `qa-e2f40716-9512-4a88-9809-4401e2b4f247` |
| 10 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-6e371e75-0d45-4ec8-a76d-3aa3537f0d9d` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-c3a123a6-7653-47db-a4b1-4041d8b8b175` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-61ed49d2-1256-4774-bcfe-ab6ce2e50dd4` |
| 13 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-269eb4ea-d52c-4b98-aad4-188d2f445241` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 16 | `qa-8fb9cdd1-51c9-46be-87ed-7de6333f51d8` |
| 15 | `GET /v1/credits/balance` | 200 | 5 | `qa-b7a9ade1-287b-4346-a97f-b038f93c19a4` |
| 16 | `GET /v1/credits/balance` | 200 | 7 | `qa-b6396e89-295d-4585-b0fb-e4ef50ce4583` |
| 17 | `POST /v1/auth/token` | 200 | 13 | `qa-167fa428-5bdb-4ff0-8ed6-3ad57fdc04dc` |
| 18 | `GET /v1/conversations/{id}` | 403 | 8 | `qa-57c46237-ada3-415b-8ae0-c4e99dde77ef` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 7 | `qa-55d606de-a614-4067-b87a-1ea797cabe92` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 7 | `qa-65f7bab8-7731-42d0-965d-3f582f32df74` |
| 21 | `GET /v1/conversations` | 200 | 6 | `qa-f9a6827d-2335-42d0-9b91-5e58e3f8c984` |
| 22 | `GET /v1/credits/balance` | 200 | 5 | `qa-e4a27452-594e-4b5b-965b-8a4b8d910a45` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 10 | `qa-4808919c-639c-4a8a-b425-8025380700ad` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 5 | `qa-1d9edfb3-b070-491b-a604-704c365637f3` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 5 | `qa-adcb86f8-a17c-4a7a-be8e-60b231f626b7` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 5 | `qa-4e8d898e-d451-4e47-8b4a-848887b3da48` |
| 27 | `GET /v1/credits/balance` | 200 | 5 | `qa-74a98ada-17fc-42df-bdf2-2195bdda39eb` |
| 28 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-5146edca-0847-41c9-b793-2ce32c110f0e` |
| 29 | `POST /v1/auth/token` | 401 | 5 | `qa-ced308c9-d800-4e7e-9143-26993915676f` |
| 30 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-07fe1e5f-eeea-4bda-8dec-514473748167` |
| 31 | `POST /v1/auth/token` | 401 | 4 | `qa-ca845f24-7afb-4705-8718-0b8ba06c035f` |
| 32 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-4e6bcb80-bd86-4d2d-9601-4790e2fcf1e1` |
| 33 | `POST /v1/auth/token` | 401 | 4 | `qa-132a0337-ab20-4511-a119-f4ec56b73e7e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b3c99826-d337-4a4a-9487-c85aab338f34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3c99826-d337-4a4a-9487-c85aab338f34
Content-Type: application/json

--- request body ---
{"handle":"qa-68627b6b5e30","displayName":"QA 68627b6b5e30","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3c99826-d337-4a4a-9487-c85aab338f34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Location: /v1/accounts/qa-68627b6b5e30
X-Served-Region: eu
Content-Length: 181

{"id":"acc_51e37db1-6789-4868-8a3c-d3367be33b9a","handle":"qa-68627b6b5e30","displayName":"QA 68627b6b5e30","region":"eu","role":"user","createdAt":"2026-11-01T09:23:24.789353234Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2fe5b6d2-abe2-4e1e-ac56-25652b502b43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fe5b6d2-abe2-4e1e-ac56-25652b502b43
Content-Type: application/json

--- request body ---
{"handle":"qa-cbe7c1ca1a9f","displayName":"QA cbe7c1ca1a9f","password":"****","region":"us"}

--- response: 201 in 17 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fe5b6d2-abe2-4e1e-ac56-25652b502b43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Location: /v1/accounts/qa-cbe7c1ca1a9f
X-Served-Region: us
Content-Length: 181

{"id":"acc_d057944f-9088-472e-a7ab-292c7d9deb67","handle":"qa-cbe7c1ca1a9f","displayName":"QA cbe7c1ca1a9f","region":"us","role":"user","createdAt":"2026-11-01T09:23:24.825483656Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-b9443147-3620-471a-b452-58b4568ea629

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9443147-3620-471a-b452-58b4568ea629
Content-Type: application/json

--- request body ---
{"handle":"qa-0151d75ba682","displayName":"QA 0151d75ba682","password":"****","region":"in"}

--- response: 201 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9443147-3620-471a-b452-58b4568ea629
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
Location: /v1/accounts/qa-0151d75ba682
X-Served-Region: in
Content-Length: 181

{"id":"acc_0fcf9a07-100d-4190-91f3-f7da1baf1a17","handle":"qa-0151d75ba682","displayName":"QA 0151d75ba682","region":"in","role":"user","createdAt":"2026-11-01T09:23:24.848496897Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-0034f8fc-f43b-4e8f-a037-07b418d4dc21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0034f8fc-f43b-4e8f-a037-07b418d4dc21
Content-Type: application/json

--- request body ---
{"handle":"qa-68627b6b5e30","password":"****"}

--- response: 200 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-0034f8fc-f43b-4e8f-a037-07b418d4dc21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_51e37db1-6789-4868-8a3c-d3367be33b9a"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-c28f6698-cc33-424b-838e-8681d30713d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c28f6698-cc33-424b-838e-8681d30713d0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cbe7c1ca1a9f","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-c28f6698-cc33-424b-838e-8681d30713d0
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
Location: /v1/conversations/cnv_b17db21b-9ebe-4978-8cea-856ce5511817
X-Data-Region: us
Content-Length: 238

{"id":"cnv_b17db21b-9ebe-4978-8cea-856ce5511817","subject":"Project kickoff","status":"open","region":"us","participants":["qa-68627b6b5e30","qa-cbe7c1ca1a9f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:24.883490139Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-81f2d55f-6ded-4ae1-a945-337a7c45b007

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81f2d55f-6ded-4ae1-a945-337a7c45b007
Content-Type: application/json

--- request body ---
{"handle":"qa-cbe7c1ca1a9f","password":"****"}

--- response: 200 in 23 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-81f2d55f-6ded-4ae1-a945-337a7c45b007
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d057944f-9088-472e-a7ab-292c7d9deb67"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-e9ab6652-1888-4824-8ce9-f35e4e22cf52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9ab6652-1888-4824-8ce9-f35e4e22cf52
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9ab6652-1888-4824-8ce9-f35e4e22cf52
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

{"items":[{"id":"cnv_b17db21b-9ebe-4978-8cea-856ce5511817","subject":"Project kickoff","status":"open","region":"us","participants":["qa-68627b6b5e30","qa-cbe7c1ca1a9f"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-01T09:23:24.883490139Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_b17db21b-9ebe-4978-8cea-856ce5511817/messages
correlation: qa-08643074-51de-4ccc-98b9-ba8147a5ad9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08643074-51de-4ccc-98b9-ba8147a5ad9d
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-08643074-51de-4ccc-98b9-ba8147a5ad9d
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

{"items":[{"id":"msg_1039f6b2-f2bf-4b1d-bf85-588d35379b87","conversationId":"cnv_b17db21b-9ebe-4978-8cea-856ce5511817","sender":"qa-68627b6b5e30","body":"Hi Ben, got a minute?","createdAt":"2026-11-01T09:23:24.883525435Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_b17db21b-9ebe-4978-8cea-856ce5511817/read
correlation: qa-e2f40716-9512-4a88-9809-4401e2b4f247

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2f40716-9512-4a88-9809-4401e2b4f247
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2f40716-9512-4a88-9809-4401e2b4f247
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

{"conversationId":"cnv_b17db21b-9ebe-4978-8cea-856ce5511817","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_b17db21b-9ebe-4978-8cea-856ce5511817
correlation: qa-6e371e75-0d45-4ec8-a76d-3aa3537f0d9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e371e75-0d45-4ec8-a76d-3aa3537f0d9d
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e371e75-0d45-4ec8-a76d-3aa3537f0d9d
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

{"id":"cnv_b17db21b-9ebe-4978-8cea-856ce5511817","subject":"Project kickoff","status":"open","region":"us","participants":["qa-68627b6b5e30","qa-cbe7c1ca1a9f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:24.883490139Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_b17db21b-9ebe-4978-8cea-856ce5511817/messages
correlation: qa-c3a123a6-7653-47db-a4b1-4041d8b8b175

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3a123a6-7653-47db-a4b1-4041d8b8b175
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3a123a6-7653-47db-a4b1-4041d8b8b175
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

{"id":"msg_0b4238a8-80fd-4ec9-9eee-656fc76367c4","conversationId":"cnv_b17db21b-9ebe-4978-8cea-856ce5511817","sender":"qa-cbe7c1ca1a9f","body":"Sure, now works","createdAt":"2026-11-01T09:23:25.098870390Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_b17db21b-9ebe-4978-8cea-856ce5511817/messages
correlation: qa-61ed49d2-1256-4774-bcfe-ab6ce2e50dd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61ed49d2-1256-4774-bcfe-ab6ce2e50dd4
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-61ed49d2-1256-4774-bcfe-ab6ce2e50dd4
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

{"id":"msg_0264e461-fb51-4dd6-88a6-8ac234c766c4","conversationId":"cnv_b17db21b-9ebe-4978-8cea-856ce5511817","sender":"qa-cbe7c1ca1a9f","body":"Calling you","createdAt":"2026-11-01T09:23:25.129215596Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_b17db21b-9ebe-4978-8cea-856ce5511817
correlation: qa-269eb4ea-d52c-4b98-aad4-188d2f445241

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-269eb4ea-d52c-4b98-aad4-188d2f445241
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-269eb4ea-d52c-4b98-aad4-188d2f445241
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

{"id":"cnv_b17db21b-9ebe-4978-8cea-856ce5511817","subject":"Project kickoff","status":"open","region":"us","participants":["qa-68627b6b5e30","qa-cbe7c1ca1a9f"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-01T09:23:24.883490139Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_b17db21b-9ebe-4978-8cea-856ce5511817/messages
correlation: qa-8fb9cdd1-51c9-46be-87ed-7de6333f51d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fb9cdd1-51c9-46be-87ed-7de6333f51d8
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fb9cdd1-51c9-46be-87ed-7de6333f51d8
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

{"items":[{"id":"msg_1039f6b2-f2bf-4b1d-bf85-588d35379b87","conversationId":"cnv_b17db21b-9ebe-4978-8cea-856ce5511817","sender":"qa-68627b6b5e30","body":"Hi Ben, got a minute?","createdAt":"2026-11-01T09:23:24.883525435Z"},{"id":"msg_0b4238a8-80fd-4ec9-9eee-656fc76367c4","conversationId":"cnv_b17db21b-9ebe-4978-8cea-856ce5511817","sender":"qa-cbe7c1ca1a9f","body":"Sure, now works","createdAt":"2026-11-01T09:23:25.098870390Z"},{"id":"msg_0264e461-fb51-4dd6-88a6-8ac234c766c4","conversationId":"cnv_b17db21b-9ebe-4978-8cea-856ce5511817","sender":"qa-cbe7c1ca1a9f","body":"Calling you","createdAt":"2026-11-01T09:23:25.129215596Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-b7a9ade1-287b-4346-a97f-b038f93c19a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7a9ade1-287b-4346-a97f-b038f93c19a4
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7a9ade1-287b-4346-a97f-b038f93c19a4
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

{"balance":4,"currency":"credits","accountId":"acc_51e37db1-6789-4868-8a3c-d3367be33b9a"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-b6396e89-295d-4585-b0fb-e4ef50ce4583

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6396e89-295d-4585-b0fb-e4ef50ce4583
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6396e89-295d-4585-b0fb-e4ef50ce4583
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

{"balance":3,"currency":"credits","accountId":"acc_d057944f-9088-472e-a7ab-292c7d9deb67"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-167fa428-5bdb-4ff0-8ed6-3ad57fdc04dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-167fa428-5bdb-4ff0-8ed6-3ad57fdc04dc
Content-Type: application/json

--- request body ---
{"handle":"qa-0151d75ba682","password":"****"}

--- response: 200 in 13 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-167fa428-5bdb-4ff0-8ed6-3ad57fdc04dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0fcf9a07-100d-4190-91f3-f7da1baf1a17"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_b17db21b-9ebe-4978-8cea-856ce5511817
correlation: qa-57c46237-ada3-415b-8ae0-c4e99dde77ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57c46237-ada3-415b-8ae0-c4e99dde77ef
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57c46237-ada3-415b-8ae0-c4e99dde77ef
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_b17db21b-9ebe-4978-8cea-856ce5511817","correlationId":"qa-57c46237-ada3-415b-8ae0-c4e99dde77ef"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_b17db21b-9ebe-4978-8cea-856ce5511817/messages
correlation: qa-55d606de-a614-4067-b87a-1ea797cabe92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55d606de-a614-4067-b87a-1ea797cabe92
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-55d606de-a614-4067-b87a-1ea797cabe92
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_b17db21b-9ebe-4978-8cea-856ce5511817/messages","correlationId":"qa-55d606de-a614-4067-b87a-1ea797cabe92"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_b17db21b-9ebe-4978-8cea-856ce5511817/messages
correlation: qa-65f7bab8-7731-42d0-965d-3f582f32df74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65f7bab8-7731-42d0-965d-3f582f32df74
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65f7bab8-7731-42d0-965d-3f582f32df74
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_b17db21b-9ebe-4978-8cea-856ce5511817/messages","correlationId":"qa-65f7bab8-7731-42d0-965d-3f582f32df74"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-f9a6827d-2335-42d0-9b91-5e58e3f8c984

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9a6827d-2335-42d0-9b91-5e58e3f8c984
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9a6827d-2335-42d0-9b91-5e58e3f8c984
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
correlation: qa-e4a27452-594e-4b5b-965b-8a4b8d910a45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4a27452-594e-4b5b-965b-8a4b8d910a45
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4a27452-594e-4b5b-965b-8a4b8d910a45
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

{"balance":5,"currency":"credits","accountId":"acc_0fcf9a07-100d-4190-91f3-f7da1baf1a17"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_b17db21b-9ebe-4978-8cea-856ce5511817/close
correlation: qa-4808919c-639c-4a8a-b425-8025380700ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4808919c-639c-4a8a-b425-8025380700ad
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-4808919c-639c-4a8a-b425-8025380700ad
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
Content-Length: 284

{"id":"cnv_b17db21b-9ebe-4978-8cea-856ce5511817","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-68627b6b5e30","qa-cbe7c1ca1a9f"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-01T09:23:24.883490139Z","closedAt":"2026-11-01T09:23:25.632519291Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_b17db21b-9ebe-4978-8cea-856ce5511817/close
correlation: qa-1d9edfb3-b070-491b-a604-704c365637f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d9edfb3-b070-491b-a604-704c365637f3
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d9edfb3-b070-491b-a604-704c365637f3
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
Content-Length: 284

{"id":"cnv_b17db21b-9ebe-4978-8cea-856ce5511817","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-68627b6b5e30","qa-cbe7c1ca1a9f"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-01T09:23:24.883490139Z","closedAt":"2026-11-01T09:23:25.632519291Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_b17db21b-9ebe-4978-8cea-856ce5511817/messages
correlation: qa-adcb86f8-a17c-4a7a-be8e-60b231f626b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adcb86f8-a17c-4a7a-be8e-60b231f626b7
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-adcb86f8-a17c-4a7a-be8e-60b231f626b7
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

{"items":[{"id":"msg_1039f6b2-f2bf-4b1d-bf85-588d35379b87","conversationId":"cnv_b17db21b-9ebe-4978-8cea-856ce5511817","sender":"qa-68627b6b5e30","body":"Hi Ben, got a minute?","createdAt":"2026-11-01T09:23:24.883525435Z"},{"id":"msg_0b4238a8-80fd-4ec9-9eee-656fc76367c4","conversationId":"cnv_b17db21b-9ebe-4978-8cea-856ce5511817","sender":"qa-cbe7c1ca1a9f","body":"Sure, now works","createdAt":"2026-11-01T09:23:25.098870390Z"},{"id":"msg_0264e461-fb51-4dd6-88a6-8ac234c766c4","conversationId":"cnv_b17db21b-9ebe-4978-8cea-856ce5511817","sender":"qa-cbe7c1ca1a9f","body":"Calling you","createdAt":"2026-11-01T09:23:25.129215596Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_b17db21b-9ebe-4978-8cea-856ce5511817/messages
correlation: qa-4e8d898e-d451-4e47-8b4a-848887b3da48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e8d898e-d451-4e47-8b4a-848887b3da48
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4e8d898e-d451-4e47-8b4a-848887b3da48
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_b17db21b-9ebe-4978-8cea-856ce5511817/messages","correlationId":"qa-4e8d898e-d451-4e47-8b4a-848887b3da48"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-74a98ada-17fc-42df-bdf2-2195bdda39eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74a98ada-17fc-42df-bdf2-2195bdda39eb
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-74a98ada-17fc-42df-bdf2-2195bdda39eb
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
X-Served-Region: us
Content-Length: 89

{"balance":3,"currency":"credits","accountId":"acc_d057944f-9088-472e-a7ab-292c7d9deb67"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5146edca-0847-41c9-b793-2ce32c110f0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5146edca-0847-41c9-b793-2ce32c110f0e
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5146edca-0847-41c9-b793-2ce32c110f0e
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
correlation: qa-ced308c9-d800-4e7e-9143-26993915676f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ced308c9-d800-4e7e-9143-26993915676f
Content-Type: application/json

--- request body ---
{"handle":"qa-0151d75ba682","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ced308c9-d800-4e7e-9143-26993915676f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ced308c9-d800-4e7e-9143-26993915676f"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-07fe1e5f-eeea-4bda-8dec-514473748167

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07fe1e5f-eeea-4bda-8dec-514473748167
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-07fe1e5f-eeea-4bda-8dec-514473748167
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
X-Served-Region: us
```

## 31. POST /v1/auth/token

```text
#31 POST http://localhost:7070/v1/auth/token
correlation: qa-ca845f24-7afb-4705-8718-0b8ba06c035f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca845f24-7afb-4705-8718-0b8ba06c035f
Content-Type: application/json

--- request body ---
{"handle":"qa-cbe7c1ca1a9f","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ca845f24-7afb-4705-8718-0b8ba06c035f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ca845f24-7afb-4705-8718-0b8ba06c035f"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4e6bcb80-bd86-4d2d-9601-4790e2fcf1e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e6bcb80-bd86-4d2d-9601-4790e2fcf1e1
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4e6bcb80-bd86-4d2d-9601-4790e2fcf1e1
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
```

## 33. POST /v1/auth/token

```text
#33 POST http://localhost:7070/v1/auth/token
correlation: qa-132a0337-ab20-4511-a119-f4ec56b73e7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-132a0337-ab20-4511-a119-f4ec56b73e7e
Content-Type: application/json

--- request body ---
{"handle":"qa-68627b6b5e30","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-132a0337-ab20-4511-a119-f4ec56b73e7e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-132a0337-ab20-4511-a119-f4ec56b73e7e"}
```
