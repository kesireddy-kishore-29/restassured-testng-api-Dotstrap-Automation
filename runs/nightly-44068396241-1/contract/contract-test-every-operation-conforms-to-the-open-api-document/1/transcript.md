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
| 1 | `POST /v1/accounts` | 201 | 328 | `qa-9bc31e50-3d2d-4993-abe3-5c9a3eacc3df` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-c5e46a1c-ab4f-4196-b53e-44e3594c451f` |
| 3 | `GET /health` | 200 | 42 | `qa-c99e18f3-1527-41dd-99f9-48c0fea26913` |
| 4 | `POST /v1/auth/token` | 200 | 15 | `qa-11b60cb3-9cf8-4c34-90a9-3d4b2fd58685` |
| 5 | `GET /v1/accounts/me` | 200 | 12 | `qa-48bc7ed8-6b82-44fa-9fa1-4591df469aec` |
| 6 | `PATCH /v1/accounts/me` | 200 | 13 | `qa-e196b5be-8865-4ec4-9cb9-0f981ecb1c9c` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 12 | `qa-caf462b5-fbb0-4120-ac90-114c9cc3578f` |
| 8 | `POST /v1/conversations` | 201 | 7 | `qa-7f893f48-a4e8-4e2f-907b-8698eaf72f4f` |
| 9 | `GET /v1/conversations` | 200 | 9 | `qa-1280c7ae-66c6-4ecc-9f17-3b5687221aea` |
| 10 | `POST /v1/auth/token` | 200 | 27 | `qa-b3e1dea1-7b2c-4777-a70d-b5fae79db1cd` |
| 11 | `GET /v1/conversations/{id}` | 200 | 7 | `qa-335d7bc6-7ab9-4d7d-947a-e014c38ed5ea` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 19 | `qa-ad677adb-9b5d-40f3-9751-a9b7eb1b9b22` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-d7fb3827-8483-4d19-b6cc-e05a2fe8b2a6` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 8 | `qa-9b13122a-ddec-4e7e-8675-142921848b6d` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 9 | `qa-aad017a1-18d6-4447-92b8-729b09f956d2` |
| 16 | `GET /v1/credits/balance` | 200 | 15 | `qa-1e4e942c-a17e-4008-9fff-d725dfac9891` |
| 17 | `GET /v1/credits/ledger` | 200 | 17 | `qa-412c4f77-59ba-44dd-b2ca-677158b2126c` |
| 18 | `POST /v1/credits/purchases` | 201 | 8 | `qa-b9e70f53-2dc5-4790-9820-513cf4812b10` |
| 19 | `GET /v1/admin/stats` | 403 | 12 | `qa-5f13627f-7ed3-4c74-8657-35a051731966` |
| 20 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-c1b5958b-6230-442f-9ee2-f69f1671689a` |
| 21 | `POST /v1/auth/token` | 401 | 13 | `qa-917e9ddd-6553-4c87-a221-2d0cfef5978c` |
| 22 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-73ea86cd-c06b-4ffe-a0e9-2518bbc79114` |
| 23 | `POST /v1/auth/token` | 401 | 12 | `qa-ba133bd3-0f2a-4945-aedc-8ce46d1e3a97` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9bc31e50-3d2d-4993-abe3-5c9a3eacc3df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bc31e50-3d2d-4993-abe3-5c9a3eacc3df
Content-Type: application/json

--- request body ---
{"handle":"qa-5f383231cf62","displayName":"QA 5f383231cf62","password":"****","region":"eu"}

--- response: 201 in 328 ms ---
Date: Tue, 17 Nov 2026 10:50:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bc31e50-3d2d-4993-abe3-5c9a3eacc3df
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
Location: /v1/accounts/qa-5f383231cf62
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3dba2ee6-6fea-4526-8ee0-f9d0ab0db64a","handle":"qa-5f383231cf62","displayName":"QA 5f383231cf62","region":"eu","role":"user","createdAt":"2026-11-17T10:50:16.796456004Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c5e46a1c-ab4f-4196-b53e-44e3594c451f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5e46a1c-ab4f-4196-b53e-44e3594c451f
Content-Type: application/json

--- request body ---
{"handle":"qa-6438ea11a01c","displayName":"QA 6438ea11a01c","password":"****","region":"us"}

--- response: 201 in 30 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5e46a1c-ab4f-4196-b53e-44e3594c451f
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
Location: /v1/accounts/qa-6438ea11a01c
X-Served-Region: us
Content-Length: 181

{"id":"acc_7487a8b2-31e8-4de6-aa98-4f8cad3f83d1","handle":"qa-6438ea11a01c","displayName":"QA 6438ea11a01c","region":"us","role":"user","createdAt":"2026-11-17T10:50:17.093422987Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-c99e18f3-1527-41dd-99f9-48c0fea26913

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c99e18f3-1527-41dd-99f9-48c0fea26913
Content-Type: application/json

--- response: 200 in 42 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-c99e18f3-1527-41dd-99f9-48c0fea26913
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
correlation: qa-11b60cb3-9cf8-4c34-90a9-3d4b2fd58685

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11b60cb3-9cf8-4c34-90a9-3d4b2fd58685
Content-Type: application/json

--- request body ---
{"handle":"qa-5f383231cf62","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-11b60cb3-9cf8-4c34-90a9-3d4b2fd58685
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3dba2ee6-6fea-4526-8ee0-f9d0ab0db64a"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-48bc7ed8-6b82-44fa-9fa1-4591df469aec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48bc7ed8-6b82-44fa-9fa1-4591df469aec
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-48bc7ed8-6b82-44fa-9fa1-4591df469aec
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

{"id":"acc_3dba2ee6-6fea-4526-8ee0-f9d0ab0db64a","handle":"qa-5f383231cf62","displayName":"QA 5f383231cf62","region":"eu","role":"user","createdAt":"2026-11-17T10:50:16.796456004Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-e196b5be-8865-4ec4-9cb9-0f981ecb1c9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e196b5be-8865-4ec4-9cb9-0f981ecb1c9c
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-e196b5be-8865-4ec4-9cb9-0f981ecb1c9c
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

{"id":"acc_3dba2ee6-6fea-4526-8ee0-f9d0ab0db64a","handle":"qa-5f383231cf62","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-17T10:50:16.796456004Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-6438ea11a01c
correlation: qa-caf462b5-fbb0-4120-ac90-114c9cc3578f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-caf462b5-fbb0-4120-ac90-114c9cc3578f
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-caf462b5-fbb0-4120-ac90-114c9cc3578f
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

{"handle":"qa-6438ea11a01c","displayName":"QA 6438ea11a01c","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-7f893f48-a4e8-4e2f-907b-8698eaf72f4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f893f48-a4e8-4e2f-907b-8698eaf72f4f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6438ea11a01c","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f893f48-a4e8-4e2f-907b-8698eaf72f4f
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
Location: /v1/conversations/cnv_343aad55-7a7a-4b4e-b6ca-a1c0b89368ed
X-Data-Region: us
Content-Length: 238

{"id":"cnv_343aad55-7a7a-4b4e-b6ca-a1c0b89368ed","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-5f383231cf62","qa-6438ea11a01c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:17.305550246Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-1280c7ae-66c6-4ecc-9f17-3b5687221aea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1280c7ae-66c6-4ecc-9f17-3b5687221aea
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-1280c7ae-66c6-4ecc-9f17-3b5687221aea
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

{"items":[{"id":"cnv_343aad55-7a7a-4b4e-b6ca-a1c0b89368ed","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-5f383231cf62","qa-6438ea11a01c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:17.305550246Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-b3e1dea1-7b2c-4777-a70d-b5fae79db1cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3e1dea1-7b2c-4777-a70d-b5fae79db1cd
Content-Type: application/json

--- request body ---
{"handle":"qa-6438ea11a01c","password":"****"}

--- response: 200 in 27 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3e1dea1-7b2c-4777-a70d-b5fae79db1cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7487a8b2-31e8-4de6-aa98-4f8cad3f83d1"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_343aad55-7a7a-4b4e-b6ca-a1c0b89368ed
correlation: qa-335d7bc6-7ab9-4d7d-947a-e014c38ed5ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-335d7bc6-7ab9-4d7d-947a-e014c38ed5ea
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-335d7bc6-7ab9-4d7d-947a-e014c38ed5ea
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

{"id":"cnv_343aad55-7a7a-4b4e-b6ca-a1c0b89368ed","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-5f383231cf62","qa-6438ea11a01c"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-17T10:50:17.305550246Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_343aad55-7a7a-4b4e-b6ca-a1c0b89368ed/messages
correlation: qa-ad677adb-9b5d-40f3-9751-a9b7eb1b9b22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad677adb-9b5d-40f3-9751-a9b7eb1b9b22
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad677adb-9b5d-40f3-9751-a9b7eb1b9b22
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

{"items":[{"id":"msg_6d9cb6f6-c91c-4e67-bc8c-f691085d6738","conversationId":"cnv_343aad55-7a7a-4b4e-b6ca-a1c0b89368ed","sender":"qa-5f383231cf62","body":"Hi","createdAt":"2026-11-17T10:50:17.305570606Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_343aad55-7a7a-4b4e-b6ca-a1c0b89368ed/messages
correlation: qa-d7fb3827-8483-4d19-b6cc-e05a2fe8b2a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7fb3827-8483-4d19-b6cc-e05a2fe8b2a6
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7fb3827-8483-4d19-b6cc-e05a2fe8b2a6
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

{"id":"msg_e4544094-54c5-459c-89db-0f7a5567893b","conversationId":"cnv_343aad55-7a7a-4b4e-b6ca-a1c0b89368ed","sender":"qa-6438ea11a01c","body":"Reply","createdAt":"2026-11-17T10:50:17.420689222Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_343aad55-7a7a-4b4e-b6ca-a1c0b89368ed/read
correlation: qa-9b13122a-ddec-4e7e-8675-142921848b6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b13122a-ddec-4e7e-8675-142921848b6d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b13122a-ddec-4e7e-8675-142921848b6d
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

{"conversationId":"cnv_343aad55-7a7a-4b4e-b6ca-a1c0b89368ed","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_343aad55-7a7a-4b4e-b6ca-a1c0b89368ed/close
correlation: qa-aad017a1-18d6-4447-92b8-729b09f956d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aad017a1-18d6-4447-92b8-729b09f956d2
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-aad017a1-18d6-4447-92b8-729b09f956d2
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

{"id":"cnv_343aad55-7a7a-4b4e-b6ca-a1c0b89368ed","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-5f383231cf62","qa-6438ea11a01c"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-17T10:50:17.305550246Z","closedAt":"2026-11-17T10:50:17.451962751Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-1e4e942c-a17e-4008-9fff-d725dfac9891

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e4e942c-a17e-4008-9fff-d725dfac9891
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e4e942c-a17e-4008-9fff-d725dfac9891
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

{"balance":4,"currency":"credits","accountId":"acc_3dba2ee6-6fea-4526-8ee0-f9d0ab0db64a"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-412c4f77-59ba-44dd-b2ca-677158b2126c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-412c4f77-59ba-44dd-b2ca-677158b2126c
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-412c4f77-59ba-44dd-b2ca-677158b2126c
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

{"items":[{"id":"led_db4856df-c667-4dc4-99db-abd8a070dcfd","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-17T10:50:16.796493067Z"},{"id":"led_967d6b82-dc85-49d0-9488-2360cf7db915","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_343aad55-7a7a-4b4e-b6ca-a1c0b89368ed","createdAt":"2026-11-17T10:50:17.305539194Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b9e70f53-2dc5-4790-9820-513cf4812b10

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4a00c584c75642079e709a459b692825
X-Correlation-Id: qa-b9e70f53-2dc5-4790-9820-513cf4812b10
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9e70f53-2dc5-4790-9820-513cf4812b10
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
Location: /v1/credits/purchases/pur_d17f1b6f-ae6d-4f08-8ef3-489b5e18b24d
Content-Length: 144

{"id":"pur_d17f1b6f-ae6d-4f08-8ef3-489b5e18b24d","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-17T10:50:17.516746111Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-5f13627f-7ed3-4c74-8657-35a051731966

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f13627f-7ed3-4c74-8657-35a051731966
Content-Type: application/json

--- response: 403 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5f13627f-7ed3-4c74-8657-35a051731966
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-5f13627f-7ed3-4c74-8657-35a051731966"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c1b5958b-6230-442f-9ee2-f69f1671689a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1b5958b-6230-442f-9ee2-f69f1671689a
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c1b5958b-6230-442f-9ee2-f69f1671689a
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
correlation: qa-917e9ddd-6553-4c87-a221-2d0cfef5978c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-917e9ddd-6553-4c87-a221-2d0cfef5978c
Content-Type: application/json

--- request body ---
{"handle":"qa-6438ea11a01c","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-917e9ddd-6553-4c87-a221-2d0cfef5978c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-917e9ddd-6553-4c87-a221-2d0cfef5978c"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-73ea86cd-c06b-4ffe-a0e9-2518bbc79114

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73ea86cd-c06b-4ffe-a0e9-2518bbc79114
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-73ea86cd-c06b-4ffe-a0e9-2518bbc79114
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
correlation: qa-ba133bd3-0f2a-4945-aedc-8ce46d1e3a97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba133bd3-0f2a-4945-aedc-8ce46d1e3a97
Content-Type: application/json

--- request body ---
{"handle":"qa-5f383231cf62","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba133bd3-0f2a-4945-aedc-8ce46d1e3a97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ba133bd3-0f2a-4945-aedc-8ce46d1e3a97"}
```
