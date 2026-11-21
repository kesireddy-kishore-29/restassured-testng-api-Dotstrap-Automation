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
| 1 | `POST /v1/accounts` | 201 | 432 | `qa-b4bdf56f-286c-4cad-9acc-176e2d5ad350` |
| 2 | `POST /v1/accounts` | 201 | 61 | `qa-224174a6-accf-4a24-b133-1247a257291e` |
| 3 | `POST /v1/accounts` | 201 | 88 | `qa-af9ee44c-0464-4682-9faa-cf596a0872e5` |
| 4 | `POST /v1/auth/token` | 200 | 93 | `qa-911de6b6-a3df-4df8-8e61-a41a14f3618c` |
| 5 | `POST /v1/conversations` | 201 | 52 | `qa-0ad60aba-d508-4e55-8a46-d36060c9362c` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-48fe4a8a-10f2-4c56-bfbd-226131cc8e0a` |
| 7 | `GET /v1/conversations` | 200 | 24 | `qa-09bb93a0-f78b-48fb-81c3-25f753bb4d0d` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 49 | `qa-bfdedad4-b249-432c-acd4-0f0e927f4809` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 21 | `qa-7021458f-1d69-4db3-bd43-9609c7108e5b` |
| 10 | `GET /v1/conversations/{id}` | 200 | 17 | `qa-63fbd6f8-41d0-4da9-88c8-f66cf992e9b4` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-771e44d2-2ff7-44df-afb9-cf71883efd02` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-d8a1deb3-a409-4daf-b9c7-e8a192a8ca12` |
| 13 | `GET /v1/conversations/{id}` | 200 | 13 | `qa-f42ef618-8801-4000-832d-220ade47de12` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 19 | `qa-ff9e6759-4ee0-47c1-9bc3-06496e6e23c0` |
| 15 | `GET /v1/credits/balance` | 200 | 8 | `qa-aeb6fc31-4334-4028-b94e-bc4bfbbc1399` |
| 16 | `GET /v1/credits/balance` | 200 | 19 | `qa-821696a7-3c2b-44d8-bb2b-a499b0a7eff3` |
| 17 | `POST /v1/auth/token` | 200 | 27 | `qa-7d67eb4b-5b0b-4d2d-986e-d0299f1c2ba9` |
| 18 | `GET /v1/conversations/{id}` | 403 | 12 | `qa-714a2812-d406-47fc-98c2-db80aed1e8e3` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 13 | `qa-4fc3eb83-f445-49b3-8185-bc58b3a90b0d` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 12 | `qa-6b21b7a1-d7ae-4087-b3a0-7bed6aa52533` |
| 21 | `GET /v1/conversations` | 200 | 8 | `qa-6dcef5d1-d585-4083-aaca-58bd6efe8f71` |
| 22 | `GET /v1/credits/balance` | 200 | 6 | `qa-3381ff42-e420-4998-aa38-3db781f79317` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-afaf2b43-0631-454b-b68b-e22dede7bce1` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 10 | `qa-2e9e7394-1dc1-4dc7-9d26-44cb6c0d30bc` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 7 | `qa-65b502b9-5846-4c31-abc2-2e13387d70fc` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 7 | `qa-6d02b5d7-5f82-4c12-9e2a-2b3f02dec9b1` |
| 27 | `GET /v1/credits/balance` | 200 | 7 | `qa-1d8e0d2b-20b2-4fe3-8374-6a3010506e23` |
| 28 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-527c2a00-cda2-428c-9273-67ac7077ead5` |
| 29 | `POST /v1/auth/token` | 401 | 11 | `qa-b0f4629d-4599-49f5-b2a5-dbf54387ac6b` |
| 30 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-a92c2916-5f1e-4401-a7a0-5e0e99b92e04` |
| 31 | `POST /v1/auth/token` | 401 | 8 | `qa-09af3b5d-f594-4360-88a4-c435a06c11d1` |
| 32 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-2e219f64-ff3f-443c-9ebb-f48f3c95848a` |
| 33 | `POST /v1/auth/token` | 401 | 6 | `qa-2ffd95a8-61e2-4ddd-a622-4106b58d51bf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b4bdf56f-286c-4cad-9acc-176e2d5ad350

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4bdf56f-286c-4cad-9acc-176e2d5ad350
Content-Type: application/json

--- request body ---
{"handle":"qa-896b870399dc","displayName":"QA 896b870399dc","password":"****","region":"eu"}

--- response: 201 in 432 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4bdf56f-286c-4cad-9acc-176e2d5ad350
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
Location: /v1/accounts/qa-896b870399dc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_75d4b214-409f-455f-b384-749e641df394","handle":"qa-896b870399dc","displayName":"QA 896b870399dc","region":"eu","role":"user","createdAt":"2026-11-15T09:36:14.668971053Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-224174a6-accf-4a24-b133-1247a257291e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-224174a6-accf-4a24-b133-1247a257291e
Content-Type: application/json

--- request body ---
{"handle":"qa-9623b8aecd5d","displayName":"QA 9623b8aecd5d","password":"****","region":"us"}

--- response: 201 in 61 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-224174a6-accf-4a24-b133-1247a257291e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-9623b8aecd5d
X-Served-Region: us
Content-Length: 181

{"id":"acc_c17470c6-a24b-42bd-8569-babd9fa38052","handle":"qa-9623b8aecd5d","displayName":"QA 9623b8aecd5d","region":"us","role":"user","createdAt":"2026-11-15T09:36:15.218247875Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-af9ee44c-0464-4682-9faa-cf596a0872e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af9ee44c-0464-4682-9faa-cf596a0872e5
Content-Type: application/json

--- request body ---
{"handle":"qa-1cf5e4bdfcc8","displayName":"QA 1cf5e4bdfcc8","password":"****","region":"in"}

--- response: 201 in 88 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-af9ee44c-0464-4682-9faa-cf596a0872e5
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
Location: /v1/accounts/qa-1cf5e4bdfcc8
X-Served-Region: in
Content-Length: 181

{"id":"acc_f41c4d94-9bd3-4e9b-a055-19f62702b259","handle":"qa-1cf5e4bdfcc8","displayName":"QA 1cf5e4bdfcc8","region":"in","role":"user","createdAt":"2026-11-15T09:36:15.373578012Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-911de6b6-a3df-4df8-8e61-a41a14f3618c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-911de6b6-a3df-4df8-8e61-a41a14f3618c
Content-Type: application/json

--- request body ---
{"handle":"qa-896b870399dc","password":"****"}

--- response: 200 in 93 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-911de6b6-a3df-4df8-8e61-a41a14f3618c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_75d4b214-409f-455f-b384-749e641df394"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-0ad60aba-d508-4e55-8a46-d36060c9362c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ad60aba-d508-4e55-8a46-d36060c9362c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9623b8aecd5d","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 52 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ad60aba-d508-4e55-8a46-d36060c9362c
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
Location: /v1/conversations/cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d
X-Data-Region: us
Content-Length: 238

{"id":"cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d","subject":"Project kickoff","status":"open","region":"us","participants":["qa-896b870399dc","qa-9623b8aecd5d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:15.585974360Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-48fe4a8a-10f2-4c56-bfbd-226131cc8e0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48fe4a8a-10f2-4c56-bfbd-226131cc8e0a
Content-Type: application/json

--- request body ---
{"handle":"qa-9623b8aecd5d","password":"****"}

--- response: 200 in 29 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-48fe4a8a-10f2-4c56-bfbd-226131cc8e0a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c17470c6-a24b-42bd-8569-babd9fa38052"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-09bb93a0-f78b-48fb-81c3-25f753bb4d0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09bb93a0-f78b-48fb-81c3-25f753bb4d0d
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-09bb93a0-f78b-48fb-81c3-25f753bb4d0d
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

{"items":[{"id":"cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d","subject":"Project kickoff","status":"open","region":"us","participants":["qa-896b870399dc","qa-9623b8aecd5d"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-15T09:36:15.585974360Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d/messages
correlation: qa-bfdedad4-b249-432c-acd4-0f0e927f4809

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfdedad4-b249-432c-acd4-0f0e927f4809
Content-Type: application/json

--- response: 200 in 49 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfdedad4-b249-432c-acd4-0f0e927f4809
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

{"items":[{"id":"msg_071ad227-bd8f-4321-a3dc-5c7fc7f7bcea","conversationId":"cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d","sender":"qa-896b870399dc","body":"Hi Ben, got a minute?","createdAt":"2026-11-15T09:36:15.586006199Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d/read
correlation: qa-7021458f-1d69-4db3-bd43-9609c7108e5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7021458f-1d69-4db3-bd43-9609c7108e5b
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-7021458f-1d69-4db3-bd43-9609c7108e5b
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

{"conversationId":"cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d
correlation: qa-63fbd6f8-41d0-4da9-88c8-f66cf992e9b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63fbd6f8-41d0-4da9-88c8-f66cf992e9b4
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-63fbd6f8-41d0-4da9-88c8-f66cf992e9b4
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

{"id":"cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d","subject":"Project kickoff","status":"open","region":"us","participants":["qa-896b870399dc","qa-9623b8aecd5d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:15.585974360Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d/messages
correlation: qa-771e44d2-2ff7-44df-afb9-cf71883efd02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-771e44d2-2ff7-44df-afb9-cf71883efd02
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-771e44d2-2ff7-44df-afb9-cf71883efd02
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

{"id":"msg_0faa7714-a1f9-4988-9797-0c4d3b71f598","conversationId":"cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d","sender":"qa-9623b8aecd5d","body":"Sure, now works","createdAt":"2026-11-15T09:36:16.194619121Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d/messages
correlation: qa-d8a1deb3-a409-4daf-b9c7-e8a192a8ca12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8a1deb3-a409-4daf-b9c7-e8a192a8ca12
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8a1deb3-a409-4daf-b9c7-e8a192a8ca12
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

{"id":"msg_bd7e3a32-b9c5-4d00-8022-5075fe2c5616","conversationId":"cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d","sender":"qa-9623b8aecd5d","body":"Calling you","createdAt":"2026-11-15T09:36:16.216995565Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d
correlation: qa-f42ef618-8801-4000-832d-220ade47de12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f42ef618-8801-4000-832d-220ade47de12
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-f42ef618-8801-4000-832d-220ade47de12
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

{"id":"cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d","subject":"Project kickoff","status":"open","region":"us","participants":["qa-896b870399dc","qa-9623b8aecd5d"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-15T09:36:15.585974360Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d/messages
correlation: qa-ff9e6759-4ee0-47c1-9bc3-06496e6e23c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff9e6759-4ee0-47c1-9bc3-06496e6e23c0
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff9e6759-4ee0-47c1-9bc3-06496e6e23c0
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

{"items":[{"id":"msg_071ad227-bd8f-4321-a3dc-5c7fc7f7bcea","conversationId":"cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d","sender":"qa-896b870399dc","body":"Hi Ben, got a minute?","createdAt":"2026-11-15T09:36:15.586006199Z"},{"id":"msg_0faa7714-a1f9-4988-9797-0c4d3b71f598","conversationId":"cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d","sender":"qa-9623b8aecd5d","body":"Sure, now works","createdAt":"2026-11-15T09:36:16.194619121Z"},{"id":"msg_bd7e3a32-b9c5-4d00-8022-5075fe2c5616","conversationId":"cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d","sender":"qa-9623b8aecd5d","body":"Calling you","createdAt":"2026-11-15T09:36:16.216995565Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-aeb6fc31-4334-4028-b94e-bc4bfbbc1399

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aeb6fc31-4334-4028-b94e-bc4bfbbc1399
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-aeb6fc31-4334-4028-b94e-bc4bfbbc1399
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

{"balance":4,"currency":"credits","accountId":"acc_75d4b214-409f-455f-b384-749e641df394"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-821696a7-3c2b-44d8-bb2b-a499b0a7eff3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-821696a7-3c2b-44d8-bb2b-a499b0a7eff3
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-821696a7-3c2b-44d8-bb2b-a499b0a7eff3
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

{"balance":3,"currency":"credits","accountId":"acc_c17470c6-a24b-42bd-8569-babd9fa38052"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-7d67eb4b-5b0b-4d2d-986e-d0299f1c2ba9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d67eb4b-5b0b-4d2d-986e-d0299f1c2ba9
Content-Type: application/json

--- request body ---
{"handle":"qa-1cf5e4bdfcc8","password":"****"}

--- response: 200 in 27 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d67eb4b-5b0b-4d2d-986e-d0299f1c2ba9
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f41c4d94-9bd3-4e9b-a055-19f62702b259"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d
correlation: qa-714a2812-d406-47fc-98c2-db80aed1e8e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-714a2812-d406-47fc-98c2-db80aed1e8e3
Content-Type: application/json

--- response: 403 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-714a2812-d406-47fc-98c2-db80aed1e8e3
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d","correlationId":"qa-714a2812-d406-47fc-98c2-db80aed1e8e3"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d/messages
correlation: qa-4fc3eb83-f445-49b3-8185-bc58b3a90b0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fc3eb83-f445-49b3-8185-bc58b3a90b0d
Content-Type: application/json

--- response: 403 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4fc3eb83-f445-49b3-8185-bc58b3a90b0d
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d/messages","correlationId":"qa-4fc3eb83-f445-49b3-8185-bc58b3a90b0d"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d/messages
correlation: qa-6b21b7a1-d7ae-4087-b3a0-7bed6aa52533

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b21b7a1-d7ae-4087-b3a0-7bed6aa52533
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b21b7a1-d7ae-4087-b3a0-7bed6aa52533
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d/messages","correlationId":"qa-6b21b7a1-d7ae-4087-b3a0-7bed6aa52533"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-6dcef5d1-d585-4083-aaca-58bd6efe8f71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dcef5d1-d585-4083-aaca-58bd6efe8f71
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-6dcef5d1-d585-4083-aaca-58bd6efe8f71
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
correlation: qa-3381ff42-e420-4998-aa38-3db781f79317

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3381ff42-e420-4998-aa38-3db781f79317
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-3381ff42-e420-4998-aa38-3db781f79317
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

{"balance":5,"currency":"credits","accountId":"acc_f41c4d94-9bd3-4e9b-a055-19f62702b259"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d/close
correlation: qa-afaf2b43-0631-454b-b68b-e22dede7bce1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afaf2b43-0631-454b-b68b-e22dede7bce1
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-afaf2b43-0631-454b-b68b-e22dede7bce1
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

{"id":"cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-896b870399dc","qa-9623b8aecd5d"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-15T09:36:15.585974360Z","closedAt":"2026-11-15T09:36:17.337889151Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d/close
correlation: qa-2e9e7394-1dc1-4dc7-9d26-44cb6c0d30bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e9e7394-1dc1-4dc7-9d26-44cb6c0d30bc
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e9e7394-1dc1-4dc7-9d26-44cb6c0d30bc
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

{"id":"cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-896b870399dc","qa-9623b8aecd5d"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-15T09:36:15.585974360Z","closedAt":"2026-11-15T09:36:17.337889151Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d/messages
correlation: qa-65b502b9-5846-4c31-abc2-2e13387d70fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65b502b9-5846-4c31-abc2-2e13387d70fc
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-65b502b9-5846-4c31-abc2-2e13387d70fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 9
X-Served-Region: us
Content-Length: 644

{"items":[{"id":"msg_071ad227-bd8f-4321-a3dc-5c7fc7f7bcea","conversationId":"cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d","sender":"qa-896b870399dc","body":"Hi Ben, got a minute?","createdAt":"2026-11-15T09:36:15.586006199Z"},{"id":"msg_0faa7714-a1f9-4988-9797-0c4d3b71f598","conversationId":"cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d","sender":"qa-9623b8aecd5d","body":"Sure, now works","createdAt":"2026-11-15T09:36:16.194619121Z"},{"id":"msg_bd7e3a32-b9c5-4d00-8022-5075fe2c5616","conversationId":"cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d","sender":"qa-9623b8aecd5d","body":"Calling you","createdAt":"2026-11-15T09:36:16.216995565Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d/messages
correlation: qa-6d02b5d7-5f82-4c12-9e2a-2b3f02dec9b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d02b5d7-5f82-4c12-9e2a-2b3f02dec9b1
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d02b5d7-5f82-4c12-9e2a-2b3f02dec9b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 9
X-Served-Region: us
Content-Length: 329

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_23d23c92-5eb4-42bc-9512-d2ffe8cbb08d/messages","correlationId":"qa-6d02b5d7-5f82-4c12-9e2a-2b3f02dec9b1"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-1d8e0d2b-20b2-4fe3-8374-6a3010506e23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d8e0d2b-20b2-4fe3-8374-6a3010506e23
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d8e0d2b-20b2-4fe3-8374-6a3010506e23
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

{"balance":3,"currency":"credits","accountId":"acc_c17470c6-a24b-42bd-8569-babd9fa38052"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-527c2a00-cda2-428c-9273-67ac7077ead5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-527c2a00-cda2-428c-9273-67ac7077ead5
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-527c2a00-cda2-428c-9273-67ac7077ead5
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
X-Served-Region: in
```

## 29. POST /v1/auth/token

```text
#29 POST http://localhost:7070/v1/auth/token
correlation: qa-b0f4629d-4599-49f5-b2a5-dbf54387ac6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0f4629d-4599-49f5-b2a5-dbf54387ac6b
Content-Type: application/json

--- request body ---
{"handle":"qa-1cf5e4bdfcc8","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0f4629d-4599-49f5-b2a5-dbf54387ac6b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b0f4629d-4599-49f5-b2a5-dbf54387ac6b"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a92c2916-5f1e-4401-a7a0-5e0e99b92e04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a92c2916-5f1e-4401-a7a0-5e0e99b92e04
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a92c2916-5f1e-4401-a7a0-5e0e99b92e04
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
correlation: qa-09af3b5d-f594-4360-88a4-c435a06c11d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09af3b5d-f594-4360-88a4-c435a06c11d1
Content-Type: application/json

--- request body ---
{"handle":"qa-9623b8aecd5d","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09af3b5d-f594-4360-88a4-c435a06c11d1
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-09af3b5d-f594-4360-88a4-c435a06c11d1"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2e219f64-ff3f-443c-9ebb-f48f3c95848a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e219f64-ff3f-443c-9ebb-f48f3c95848a
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2e219f64-ff3f-443c-9ebb-f48f3c95848a
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
correlation: qa-2ffd95a8-61e2-4ddd-a622-4106b58d51bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ffd95a8-61e2-4ddd-a622-4106b58d51bf
Content-Type: application/json

--- request body ---
{"handle":"qa-896b870399dc","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ffd95a8-61e2-4ddd-a622-4106b58d51bf
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2ffd95a8-61e2-4ddd-a622-4106b58d51bf"}
```
