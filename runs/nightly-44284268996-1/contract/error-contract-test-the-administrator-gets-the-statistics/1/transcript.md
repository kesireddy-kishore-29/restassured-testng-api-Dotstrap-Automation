# Transcript: The administrator gets the service statistics

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#theAdministratorGetsTheStatistics` |
| Features | FEAT-AUTHZ-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-12c70698-179f-4215-b82b-d5562ebcc4f9` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-ae752997-3762-482a-a105-1097940b4edd` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-f6dd2e3f-f796-4c64-b2d6-2fb11103913f` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-841fcf75-8c45-4a1a-abeb-841261c1bc64` |
| 5 | `POST /v1/auth/token` | 200 | 9 | `qa-c6b82f4c-d558-41e8-b453-fcf7812ce9ae` |
| 6 | `GET /v1/admin/stats` | 200 | 10 | `qa-f5c9d84d-6b28-4a90-aada-639a44968afc` |
| 7 | `POST /v1/auth/token` | 200 | 15 | `qa-d6f42eb0-adf1-43e9-aef9-badc7a8f80da` |
| 8 | `DELETE /v1/accounts/me` | 204 | 42 | `qa-c2aedfc6-cdd0-4d8b-82d5-6a9d94b53607` |
| 9 | `POST /v1/auth/token` | 401 | 14 | `qa-f5b102cb-dacc-49d8-b2f5-8518eb976ce7` |
| 10 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-32c46182-5bd6-421a-922d-561a49051928` |
| 11 | `POST /v1/auth/token` | 401 | 16 | `qa-a1679cf7-10c1-435f-8c20-1e947d5fdcf5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-12c70698-179f-4215-b82b-d5562ebcc4f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12c70698-179f-4215-b82b-d5562ebcc4f9
Content-Type: application/json

--- request body ---
{"handle":"qa-e6117481efeb","displayName":"QA e6117481efeb","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-12c70698-179f-4215-b82b-d5562ebcc4f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 7
Location: /v1/accounts/qa-e6117481efeb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_27be2845-0094-422f-9952-9ca7114dc5bc","handle":"qa-e6117481efeb","displayName":"QA e6117481efeb","region":"eu","role":"user","createdAt":"2026-11-18T10:19:53.080231624Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ae752997-3762-482a-a105-1097940b4edd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae752997-3762-482a-a105-1097940b4edd
Content-Type: application/json

--- request body ---
{"handle":"qa-a07732028591","displayName":"QA a07732028591","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae752997-3762-482a-a105-1097940b4edd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 7
Location: /v1/accounts/qa-a07732028591
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b6d32bc0-0aa3-4307-a991-e32efb5e00d2","handle":"qa-a07732028591","displayName":"QA a07732028591","region":"eu","role":"user","createdAt":"2026-11-18T10:19:53.114851366Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f6dd2e3f-f796-4c64-b2d6-2fb11103913f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6dd2e3f-f796-4c64-b2d6-2fb11103913f
Content-Type: application/json

--- request body ---
{"handle":"qa-e6117481efeb","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6dd2e3f-f796-4c64-b2d6-2fb11103913f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_27be2845-0094-422f-9952-9ca7114dc5bc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-841fcf75-8c45-4a1a-abeb-841261c1bc64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-841fcf75-8c45-4a1a-abeb-841261c1bc64
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a07732028591","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-841fcf75-8c45-4a1a-abeb-841261c1bc64
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
Location: /v1/conversations/cnv_2ff9d411-c724-41f0-bc7a-3ab632460465
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2ff9d411-c724-41f0-bc7a-3ab632460465","subject":"Error contract","status":"open","region":"eu","participants":["qa-e6117481efeb","qa-a07732028591"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:53.151182043Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-c6b82f4c-d558-41e8-b453-fcf7812ce9ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6b82f4c-d558-41e8-b453-fcf7812ce9ae
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6b82f4c-d558-41e8-b453-fcf7812ce9ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f6b6f0e5-a461-4de0-ae30-8f47a6d8fb39"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-f5c9d84d-6b28-4a90-aada-639a44968afc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5c9d84d-6b28-4a90-aada-639a44968afc
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5c9d84d-6b28-4a90-aada-639a44968afc
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
Content-Length: 46

{"accounts":9,"conversations":4,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-d6f42eb0-adf1-43e9-aef9-badc7a8f80da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6f42eb0-adf1-43e9-aef9-badc7a8f80da
Content-Type: application/json

--- request body ---
{"handle":"qa-a07732028591","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6f42eb0-adf1-43e9-aef9-badc7a8f80da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b6d32bc0-0aa3-4307-a991-e32efb5e00d2"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c2aedfc6-cdd0-4d8b-82d5-6a9d94b53607

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2aedfc6-cdd0-4d8b-82d5-6a9d94b53607
Content-Type: application/json

--- response: 204 in 42 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c2aedfc6-cdd0-4d8b-82d5-6a9d94b53607
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-f5b102cb-dacc-49d8-b2f5-8518eb976ce7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5b102cb-dacc-49d8-b2f5-8518eb976ce7
Content-Type: application/json

--- request body ---
{"handle":"qa-a07732028591","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f5b102cb-dacc-49d8-b2f5-8518eb976ce7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f5b102cb-dacc-49d8-b2f5-8518eb976ce7"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-32c46182-5bd6-421a-922d-561a49051928

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32c46182-5bd6-421a-922d-561a49051928
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-32c46182-5bd6-421a-922d-561a49051928
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-a1679cf7-10c1-435f-8c20-1e947d5fdcf5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1679cf7-10c1-435f-8c20-1e947d5fdcf5
Content-Type: application/json

--- request body ---
{"handle":"qa-e6117481efeb","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1679cf7-10c1-435f-8c20-1e947d5fdcf5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a1679cf7-10c1-435f-8c20-1e947d5fdcf5"}
```
