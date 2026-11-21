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
| 1 | `POST /v1/accounts` | 201 | 284 | `qa-0549b29c-4896-455c-bd36-726aef8ddafb` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-9246ab02-a313-48c3-b2f3-e4335700aa0a` |
| 3 | `GET /health` | 200 | 58 | `qa-32592276-6c0f-435e-9bbb-7a37a2121eab` |
| 4 | `POST /v1/auth/token` | 200 | 30 | `qa-4c372cf5-3b97-44b6-ba56-cc3f2de64370` |
| 5 | `GET /v1/accounts/me` | 200 | 12 | `qa-9ed5215a-2498-4a99-bc2a-b081ad1c9f32` |
| 6 | `PATCH /v1/accounts/me` | 200 | 24 | `qa-10c06305-0b2a-4e78-8930-7b19778d0ddc` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 19 | `qa-2f264367-bc6d-4840-8c55-ceb1ccecec8c` |
| 8 | `POST /v1/conversations` | 201 | 7 | `qa-b4872fea-0ada-45c7-8402-12785127b169` |
| 9 | `GET /v1/conversations` | 200 | 9 | `qa-e941be19-7dbf-4950-bdba-a5764a0abe7a` |
| 10 | `POST /v1/auth/token` | 200 | 19 | `qa-3c962ae2-12cb-40f9-a97b-6e4b1e6828c1` |
| 11 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-9080fa7b-de0f-4525-9838-85328870ebbd` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 6 | `qa-ec1c2456-219f-46d9-b1f0-7c522432171f` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 14 | `qa-6e51c343-24a3-4101-8cc5-d6312ee1822f` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 9 | `qa-8f37fdf0-fba2-454d-99a0-8d73fa679244` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 10 | `qa-0bbfd2ae-e5b1-45d6-b566-279f74e486e6` |
| 16 | `GET /v1/credits/balance` | 200 | 5 | `qa-a7a55557-2c33-4d4c-91aa-7bd4d3f2eef6` |
| 17 | `GET /v1/credits/ledger` | 200 | 5 | `qa-c44e7f3c-8178-45be-8d1e-ff52d9d5ffb7` |
| 18 | `POST /v1/credits/purchases` | 201 | 7 | `qa-41f5cbe9-e843-4d02-bdb9-4491f978bc09` |
| 19 | `GET /v1/admin/stats` | 403 | 13 | `qa-3324c219-7d19-4226-8934-16c002e03f9f` |
| 20 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-e91b8721-159e-4035-b947-65600ec5f016` |
| 21 | `POST /v1/auth/token` | 401 | 18 | `qa-4d27b994-9d9a-4ab8-b60b-1837ccaedde9` |
| 22 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-be5b9ddd-a71f-4438-93b3-c02df7033b9a` |
| 23 | `POST /v1/auth/token` | 401 | 21 | `qa-f26a4147-d0c9-4900-84e8-235381db63a9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0549b29c-4896-455c-bd36-726aef8ddafb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0549b29c-4896-455c-bd36-726aef8ddafb
Content-Type: application/json

--- request body ---
{"handle":"qa-a3017686d42a","displayName":"QA a3017686d42a","password":"****","region":"eu"}

--- response: 201 in 284 ms ---
Date: Wed, 18 Nov 2026 10:19:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-0549b29c-4896-455c-bd36-726aef8ddafb
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
Location: /v1/accounts/qa-a3017686d42a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b22e7484-8915-4572-a9d3-9592733f5e37","handle":"qa-a3017686d42a","displayName":"QA a3017686d42a","region":"eu","role":"user","createdAt":"2026-11-18T10:19:49.630356068Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9246ab02-a313-48c3-b2f3-e4335700aa0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9246ab02-a313-48c3-b2f3-e4335700aa0a
Content-Type: application/json

--- request body ---
{"handle":"qa-4e072df31a18","displayName":"QA 4e072df31a18","password":"****","region":"us"}

--- response: 201 in 26 ms ---
Date: Wed, 18 Nov 2026 10:19:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-9246ab02-a313-48c3-b2f3-e4335700aa0a
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
Location: /v1/accounts/qa-4e072df31a18
X-Served-Region: us
Content-Length: 181

{"id":"acc_875843d4-cd75-46dd-a38b-582817bda6e2","handle":"qa-4e072df31a18","displayName":"QA 4e072df31a18","region":"us","role":"user","createdAt":"2026-11-18T10:19:49.972755995Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-32592276-6c0f-435e-9bbb-7a37a2121eab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32592276-6c0f-435e-9bbb-7a37a2121eab
Content-Type: application/json

--- response: 200 in 58 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-32592276-6c0f-435e-9bbb-7a37a2121eab
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
correlation: qa-4c372cf5-3b97-44b6-ba56-cc3f2de64370

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c372cf5-3b97-44b6-ba56-cc3f2de64370
Content-Type: application/json

--- request body ---
{"handle":"qa-a3017686d42a","password":"****"}

--- response: 200 in 30 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c372cf5-3b97-44b6-ba56-cc3f2de64370
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b22e7484-8915-4572-a9d3-9592733f5e37"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-9ed5215a-2498-4a99-bc2a-b081ad1c9f32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ed5215a-2498-4a99-bc2a-b081ad1c9f32
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ed5215a-2498-4a99-bc2a-b081ad1c9f32
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

{"id":"acc_b22e7484-8915-4572-a9d3-9592733f5e37","handle":"qa-a3017686d42a","displayName":"QA a3017686d42a","region":"eu","role":"user","createdAt":"2026-11-18T10:19:49.630356068Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-10c06305-0b2a-4e78-8930-7b19778d0ddc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10c06305-0b2a-4e78-8930-7b19778d0ddc
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 24 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-10c06305-0b2a-4e78-8930-7b19778d0ddc
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

{"id":"acc_b22e7484-8915-4572-a9d3-9592733f5e37","handle":"qa-a3017686d42a","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-18T10:19:49.630356068Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-4e072df31a18
correlation: qa-2f264367-bc6d-4840-8c55-ceb1ccecec8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f264367-bc6d-4840-8c55-ceb1ccecec8c
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f264367-bc6d-4840-8c55-ceb1ccecec8c
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

{"handle":"qa-4e072df31a18","displayName":"QA 4e072df31a18","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-b4872fea-0ada-45c7-8402-12785127b169

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4872fea-0ada-45c7-8402-12785127b169
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4e072df31a18","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4872fea-0ada-45c7-8402-12785127b169
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
Location: /v1/conversations/cnv_5183675a-eb06-43fc-9840-640d303a5cb3
X-Data-Region: us
Content-Length: 238

{"id":"cnv_5183675a-eb06-43fc-9840-640d303a5cb3","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-a3017686d42a","qa-4e072df31a18"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:50.237652437Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-e941be19-7dbf-4950-bdba-a5764a0abe7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e941be19-7dbf-4950-bdba-a5764a0abe7a
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-e941be19-7dbf-4950-bdba-a5764a0abe7a
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

{"items":[{"id":"cnv_5183675a-eb06-43fc-9840-640d303a5cb3","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-a3017686d42a","qa-4e072df31a18"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:50.237652437Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-3c962ae2-12cb-40f9-a97b-6e4b1e6828c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c962ae2-12cb-40f9-a97b-6e4b1e6828c1
Content-Type: application/json

--- request body ---
{"handle":"qa-4e072df31a18","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c962ae2-12cb-40f9-a97b-6e4b1e6828c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_875843d4-cd75-46dd-a38b-582817bda6e2"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_5183675a-eb06-43fc-9840-640d303a5cb3
correlation: qa-9080fa7b-de0f-4525-9838-85328870ebbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9080fa7b-de0f-4525-9838-85328870ebbd
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-9080fa7b-de0f-4525-9838-85328870ebbd
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

{"id":"cnv_5183675a-eb06-43fc-9840-640d303a5cb3","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-a3017686d42a","qa-4e072df31a18"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-18T10:19:50.237652437Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_5183675a-eb06-43fc-9840-640d303a5cb3/messages
correlation: qa-ec1c2456-219f-46d9-b1f0-7c522432171f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec1c2456-219f-46d9-b1f0-7c522432171f
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec1c2456-219f-46d9-b1f0-7c522432171f
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

{"items":[{"id":"msg_ecb304f7-fdf2-4009-adc8-3a61aae850d1","conversationId":"cnv_5183675a-eb06-43fc-9840-640d303a5cb3","sender":"qa-a3017686d42a","body":"Hi","createdAt":"2026-11-18T10:19:50.237678396Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_5183675a-eb06-43fc-9840-640d303a5cb3/messages
correlation: qa-6e51c343-24a3-4101-8cc5-d6312ee1822f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e51c343-24a3-4101-8cc5-d6312ee1822f
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e51c343-24a3-4101-8cc5-d6312ee1822f
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

{"id":"msg_31bf5d2f-a6ee-4ca9-9bb3-873a946681b3","conversationId":"cnv_5183675a-eb06-43fc-9840-640d303a5cb3","sender":"qa-4e072df31a18","body":"Reply","createdAt":"2026-11-18T10:19:50.342595731Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_5183675a-eb06-43fc-9840-640d303a5cb3/read
correlation: qa-8f37fdf0-fba2-454d-99a0-8d73fa679244

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f37fdf0-fba2-454d-99a0-8d73fa679244
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f37fdf0-fba2-454d-99a0-8d73fa679244
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

{"conversationId":"cnv_5183675a-eb06-43fc-9840-640d303a5cb3","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_5183675a-eb06-43fc-9840-640d303a5cb3/close
correlation: qa-0bbfd2ae-e5b1-45d6-b566-279f74e486e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bbfd2ae-e5b1-45d6-b566-279f74e486e6
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-0bbfd2ae-e5b1-45d6-b566-279f74e486e6
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

{"id":"cnv_5183675a-eb06-43fc-9840-640d303a5cb3","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-a3017686d42a","qa-4e072df31a18"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-18T10:19:50.237652437Z","closedAt":"2026-11-18T10:19:50.374683688Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-a7a55557-2c33-4d4c-91aa-7bd4d3f2eef6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7a55557-2c33-4d4c-91aa-7bd4d3f2eef6
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7a55557-2c33-4d4c-91aa-7bd4d3f2eef6
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

{"balance":4,"currency":"credits","accountId":"acc_b22e7484-8915-4572-a9d3-9592733f5e37"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-c44e7f3c-8178-45be-8d1e-ff52d9d5ffb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c44e7f3c-8178-45be-8d1e-ff52d9d5ffb7
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-c44e7f3c-8178-45be-8d1e-ff52d9d5ffb7
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

{"items":[{"id":"led_780b09cf-5e2d-4efa-a7df-4bd38de3c83c","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-18T10:19:49.630573713Z"},{"id":"led_faa3acd1-c2ad-46d8-b13f-52ce51c3992c","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_5183675a-eb06-43fc-9840-640d303a5cb3","createdAt":"2026-11-18T10:19:50.237621170Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-41f5cbe9-e843-4d02-bdb9-4491f978bc09

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b7c8944e76c1413ab6d8b5c3b0dbf2c6
X-Correlation-Id: qa-41f5cbe9-e843-4d02-bdb9-4491f978bc09
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-41f5cbe9-e843-4d02-bdb9-4491f978bc09
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
Location: /v1/credits/purchases/pur_a83ee2f5-75e9-4ea7-b463-e4fceceda9b1
Content-Length: 144

{"id":"pur_a83ee2f5-75e9-4ea7-b463-e4fceceda9b1","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-18T10:19:50.413290196Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-3324c219-7d19-4226-8934-16c002e03f9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3324c219-7d19-4226-8934-16c002e03f9f
Content-Type: application/json

--- response: 403 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3324c219-7d19-4226-8934-16c002e03f9f
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-3324c219-7d19-4226-8934-16c002e03f9f"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e91b8721-159e-4035-b947-65600ec5f016

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e91b8721-159e-4035-b947-65600ec5f016
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e91b8721-159e-4035-b947-65600ec5f016
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
correlation: qa-4d27b994-9d9a-4ab8-b60b-1837ccaedde9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d27b994-9d9a-4ab8-b60b-1837ccaedde9
Content-Type: application/json

--- request body ---
{"handle":"qa-4e072df31a18","password":"****"}

--- response: 401 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4d27b994-9d9a-4ab8-b60b-1837ccaedde9
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4d27b994-9d9a-4ab8-b60b-1837ccaedde9"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-be5b9ddd-a71f-4438-93b3-c02df7033b9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be5b9ddd-a71f-4438-93b3-c02df7033b9a
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-be5b9ddd-a71f-4438-93b3-c02df7033b9a
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
correlation: qa-f26a4147-d0c9-4900-84e8-235381db63a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f26a4147-d0c9-4900-84e8-235381db63a9
Content-Type: application/json

--- request body ---
{"handle":"qa-a3017686d42a","password":"****"}

--- response: 401 in 21 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f26a4147-d0c9-4900-84e8-235381db63a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f26a4147-d0c9-4900-84e8-235381db63a9"}
```
