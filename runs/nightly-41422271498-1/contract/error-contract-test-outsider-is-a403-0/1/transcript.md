# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 388 | `qa-afc36457-231c-4774-b9e0-d3cdb79a6a16` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-645e3ab5-d7a6-4c80-933e-e734690b4b6f` |
| 3 | `POST /v1/accounts` | 201 | 29 | `qa-fc633623-907e-42ba-80b3-c1decd89b5fa` |
| 4 | `POST /v1/auth/token` | 200 | 47 | `qa-bea4ce4b-c97f-4ef1-bc98-3cd0806f5b97` |
| 5 | `POST /v1/conversations` | 201 | 57 | `qa-64af5999-2e79-4c75-9e11-8e94d79b7ba7` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-d099ad37-d669-4d6f-a0bf-9c6b148fc09c` |
| 7 | `GET /v1/conversations/{id}` | 403 | 16 | `qa-50bc210f-e14a-441f-bf80-6b93bf63b462` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-7b858f82-df26-41bc-9f18-fa6d90c902db` |
| 9 | `POST /v1/auth/token` | 401 | 81 | `qa-35c2f236-cba2-43a5-88f9-c03c2d942e7b` |
| 10 | `POST /v1/auth/token` | 200 | 45 | `qa-e92f6c9f-7027-42f9-91ac-4dd1909f2723` |
| 11 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-122e1cde-051a-4aae-8a4a-3feb9d1c699d` |
| 12 | `POST /v1/auth/token` | 401 | 9 | `qa-8a029c70-0eb8-4794-af4d-ac386a38ce5a` |
| 13 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-34a1cd9c-31bf-451c-988c-d2dc633cd73c` |
| 14 | `POST /v1/auth/token` | 401 | 22 | `qa-c481fd02-4c99-43c4-ae1e-cc81fa819751` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-afc36457-231c-4774-b9e0-d3cdb79a6a16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afc36457-231c-4774-b9e0-d3cdb79a6a16
Content-Type: application/json

--- request body ---
{"handle":"qa-9827ba7b0157","displayName":"QA 9827ba7b0157","password":"****","region":"eu"}

--- response: 201 in 388 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-afc36457-231c-4774-b9e0-d3cdb79a6a16
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
Location: /v1/accounts/qa-9827ba7b0157
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f428e362-1a75-4746-a385-33b07c301634","handle":"qa-9827ba7b0157","displayName":"QA 9827ba7b0157","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.624424530Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-645e3ab5-d7a6-4c80-933e-e734690b4b6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-645e3ab5-d7a6-4c80-933e-e734690b4b6f
Content-Type: application/json

--- request body ---
{"handle":"qa-344f0b837739","displayName":"QA 344f0b837739","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-645e3ab5-d7a6-4c80-933e-e734690b4b6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Location: /v1/accounts/qa-344f0b837739
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a0b8dd0b-818a-43ee-86f8-48e7ef637c73","handle":"qa-344f0b837739","displayName":"QA 344f0b837739","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.953705826Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-fc633623-907e-42ba-80b3-c1decd89b5fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc633623-907e-42ba-80b3-c1decd89b5fa
Content-Type: application/json

--- request body ---
{"handle":"qa-b1fbbfd64289","displayName":"QA b1fbbfd64289","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc633623-907e-42ba-80b3-c1decd89b5fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Location: /v1/accounts/qa-b1fbbfd64289
X-Served-Region: eu
Content-Length: 181

{"id":"acc_83f1f3f0-c47e-4b77-a76f-b10d0fb6b8c0","handle":"qa-b1fbbfd64289","displayName":"QA b1fbbfd64289","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.988961579Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-bea4ce4b-c97f-4ef1-bc98-3cd0806f5b97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bea4ce4b-c97f-4ef1-bc98-3cd0806f5b97
Content-Type: application/json

--- request body ---
{"handle":"qa-9827ba7b0157","password":"****"}

--- response: 200 in 47 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-bea4ce4b-c97f-4ef1-bc98-3cd0806f5b97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f428e362-1a75-4746-a385-33b07c301634"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-64af5999-2e79-4c75-9e11-8e94d79b7ba7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64af5999-2e79-4c75-9e11-8e94d79b7ba7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-344f0b837739","subject":"Error contract","message":"Hi"}

--- response: 201 in 57 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-64af5999-2e79-4c75-9e11-8e94d79b7ba7
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
Location: /v1/conversations/cnv_6cf58885-5dfb-4254-9588-586914a43f7f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6cf58885-5dfb-4254-9588-586914a43f7f","subject":"Error contract","status":"open","region":"eu","participants":["qa-9827ba7b0157","qa-344f0b837739"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:35.190063040Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d099ad37-d669-4d6f-a0bf-9c6b148fc09c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d099ad37-d669-4d6f-a0bf-9c6b148fc09c
Content-Type: application/json

--- request body ---
{"handle":"qa-b1fbbfd64289","password":"****"}

--- response: 200 in 24 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-d099ad37-d669-4d6f-a0bf-9c6b148fc09c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_83f1f3f0-c47e-4b77-a76f-b10d0fb6b8c0"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_6cf58885-5dfb-4254-9588-586914a43f7f
correlation: qa-50bc210f-e14a-441f-bf80-6b93bf63b462

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50bc210f-e14a-441f-bf80-6b93bf63b462
Content-Type: application/json

--- response: 403 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-50bc210f-e14a-441f-bf80-6b93bf63b462
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_6cf58885-5dfb-4254-9588-586914a43f7f","correlationId":"qa-50bc210f-e14a-441f-bf80-6b93bf63b462"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7b858f82-df26-41bc-9f18-fa6d90c902db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b858f82-df26-41bc-9f18-fa6d90c902db
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7b858f82-df26-41bc-9f18-fa6d90c902db
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
correlation: qa-35c2f236-cba2-43a5-88f9-c03c2d942e7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35c2f236-cba2-43a5-88f9-c03c2d942e7b
Content-Type: application/json

--- request body ---
{"handle":"qa-b1fbbfd64289","password":"****"}

--- response: 401 in 81 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35c2f236-cba2-43a5-88f9-c03c2d942e7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-35c2f236-cba2-43a5-88f9-c03c2d942e7b"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-e92f6c9f-7027-42f9-91ac-4dd1909f2723

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e92f6c9f-7027-42f9-91ac-4dd1909f2723
Content-Type: application/json

--- request body ---
{"handle":"qa-344f0b837739","password":"****"}

--- response: 200 in 45 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e92f6c9f-7027-42f9-91ac-4dd1909f2723
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a0b8dd0b-818a-43ee-86f8-48e7ef637c73"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-122e1cde-051a-4aae-8a4a-3feb9d1c699d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-122e1cde-051a-4aae-8a4a-3feb9d1c699d
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-122e1cde-051a-4aae-8a4a-3feb9d1c699d
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-8a029c70-0eb8-4794-af4d-ac386a38ce5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a029c70-0eb8-4794-af4d-ac386a38ce5a
Content-Type: application/json

--- request body ---
{"handle":"qa-344f0b837739","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8a029c70-0eb8-4794-af4d-ac386a38ce5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8a029c70-0eb8-4794-af4d-ac386a38ce5a"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-34a1cd9c-31bf-451c-988c-d2dc633cd73c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34a1cd9c-31bf-451c-988c-d2dc633cd73c
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-34a1cd9c-31bf-451c-988c-d2dc633cd73c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-c481fd02-4c99-43c4-ae1e-cc81fa819751

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c481fd02-4c99-43c4-ae1e-cc81fa819751
Content-Type: application/json

--- request body ---
{"handle":"qa-9827ba7b0157","password":"****"}

--- response: 401 in 22 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c481fd02-4c99-43c4-ae1e-cc81fa819751
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c481fd02-4c99-43c4-ae1e-cc81fa819751"}
```
