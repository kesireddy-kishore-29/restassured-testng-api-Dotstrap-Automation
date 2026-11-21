# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-ec3a2e60-a809-47f4-a399-eea7caa567c5` |
| 2 | `POST /v1/accounts` | 201 | 9 | `qa-0f46429f-ea4f-4d06-a809-6e32f68c8530` |
| 3 | `POST /v1/accounts` | 201 | 11 | `qa-8c77a8d8-bf05-4f72-9f83-4c4f856699d9` |
| 4 | `POST /v1/auth/token` | 200 | 18 | `qa-786eb177-70f5-4225-9e39-e4c034e9c477` |
| 5 | `POST /v1/conversations` | 201 | 10 | `qa-932bff26-f957-43ba-aaa9-a87680a4a2ce` |
| 6 | `POST /v1/auth/token` | 200 | 10 | `qa-cffa2aad-cb98-4545-a1e9-fd81c27aeacb` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 16 | `qa-b022ab21-2ec7-4856-b9f3-090056c44a9a` |
| 8 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-05ccde84-a6c4-4c37-b75c-195503779d25` |
| 9 | `POST /v1/auth/token` | 401 | 16 | `qa-13088bc8-3c5b-4302-8c10-a12959ca257a` |
| 10 | `POST /v1/auth/token` | 200 | 45 | `qa-d5c424e5-9995-4588-b8ac-7ceb555765fa` |
| 11 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-f3ffa5e8-fff8-4035-9002-b10921cd614f` |
| 12 | `POST /v1/auth/token` | 401 | 20 | `qa-61b5859a-3436-47e6-b06e-c9f66d928164` |
| 13 | `DELETE /v1/accounts/me` | 204 | 42 | `qa-bafeea00-d539-46db-b76f-90f13f4b5bfc` |
| 14 | `POST /v1/auth/token` | 401 | 11 | `qa-cc6f20f0-6ebc-49fc-aa59-8f33ef1a0367` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ec3a2e60-a809-47f4-a399-eea7caa567c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec3a2e60-a809-47f4-a399-eea7caa567c5
Content-Type: application/json

--- request body ---
{"handle":"qa-660a55bbd48a","displayName":"QA 660a55bbd48a","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec3a2e60-a809-47f4-a399-eea7caa567c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Location: /v1/accounts/qa-660a55bbd48a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_52a436fc-3acb-4b75-8ca0-a08da71ddf2c","handle":"qa-660a55bbd48a","displayName":"QA 660a55bbd48a","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.705921896Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0f46429f-ea4f-4d06-a809-6e32f68c8530

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f46429f-ea4f-4d06-a809-6e32f68c8530
Content-Type: application/json

--- request body ---
{"handle":"qa-c5a4aa2004a1","displayName":"QA c5a4aa2004a1","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f46429f-ea4f-4d06-a809-6e32f68c8530
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Location: /v1/accounts/qa-c5a4aa2004a1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cf1d9772-c08c-4c6c-859a-f520506f43d5","handle":"qa-c5a4aa2004a1","displayName":"QA c5a4aa2004a1","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.730575699Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-8c77a8d8-bf05-4f72-9f83-4c4f856699d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c77a8d8-bf05-4f72-9f83-4c4f856699d9
Content-Type: application/json

--- request body ---
{"handle":"qa-3a6f6a586b39","displayName":"QA 3a6f6a586b39","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c77a8d8-bf05-4f72-9f83-4c4f856699d9
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
Location: /v1/accounts/qa-3a6f6a586b39
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aeae1ac4-341f-42db-91dc-3ddfaadddf71","handle":"qa-3a6f6a586b39","displayName":"QA 3a6f6a586b39","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.744486666Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-786eb177-70f5-4225-9e39-e4c034e9c477

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-786eb177-70f5-4225-9e39-e4c034e9c477
Content-Type: application/json

--- request body ---
{"handle":"qa-660a55bbd48a","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-786eb177-70f5-4225-9e39-e4c034e9c477
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_52a436fc-3acb-4b75-8ca0-a08da71ddf2c"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-932bff26-f957-43ba-aaa9-a87680a4a2ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-932bff26-f957-43ba-aaa9-a87680a4a2ce
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c5a4aa2004a1","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-932bff26-f957-43ba-aaa9-a87680a4a2ce
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
Location: /v1/conversations/cnv_bbef3e9a-e670-4375-a6d1-1e99eb2ee7ad
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bbef3e9a-e670-4375-a6d1-1e99eb2ee7ad","subject":"Error contract","status":"open","region":"eu","participants":["qa-660a55bbd48a","qa-c5a4aa2004a1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:50.817155106Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cffa2aad-cb98-4545-a1e9-fd81c27aeacb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cffa2aad-cb98-4545-a1e9-fd81c27aeacb
Content-Type: application/json

--- request body ---
{"handle":"qa-3a6f6a586b39","password":"****"}

--- response: 200 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-cffa2aad-cb98-4545-a1e9-fd81c27aeacb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aeae1ac4-341f-42db-91dc-3ddfaadddf71"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_bbef3e9a-e670-4375-a6d1-1e99eb2ee7ad/messages
correlation: qa-b022ab21-2ec7-4856-b9f3-090056c44a9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b022ab21-2ec7-4856-b9f3-090056c44a9a
Content-Type: application/json

--- response: 403 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b022ab21-2ec7-4856-b9f3-090056c44a9a
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_bbef3e9a-e670-4375-a6d1-1e99eb2ee7ad/messages","correlationId":"qa-b022ab21-2ec7-4856-b9f3-090056c44a9a"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-05ccde84-a6c4-4c37-b75c-195503779d25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05ccde84-a6c4-4c37-b75c-195503779d25
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-05ccde84-a6c4-4c37-b75c-195503779d25
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
correlation: qa-13088bc8-3c5b-4302-8c10-a12959ca257a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13088bc8-3c5b-4302-8c10-a12959ca257a
Content-Type: application/json

--- request body ---
{"handle":"qa-3a6f6a586b39","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-13088bc8-3c5b-4302-8c10-a12959ca257a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-13088bc8-3c5b-4302-8c10-a12959ca257a"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-d5c424e5-9995-4588-b8ac-7ceb555765fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5c424e5-9995-4588-b8ac-7ceb555765fa
Content-Type: application/json

--- request body ---
{"handle":"qa-c5a4aa2004a1","password":"****"}

--- response: 200 in 45 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5c424e5-9995-4588-b8ac-7ceb555765fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cf1d9772-c08c-4c6c-859a-f520506f43d5"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f3ffa5e8-fff8-4035-9002-b10921cd614f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3ffa5e8-fff8-4035-9002-b10921cd614f
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f3ffa5e8-fff8-4035-9002-b10921cd614f
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
correlation: qa-61b5859a-3436-47e6-b06e-c9f66d928164

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61b5859a-3436-47e6-b06e-c9f66d928164
Content-Type: application/json

--- request body ---
{"handle":"qa-c5a4aa2004a1","password":"****"}

--- response: 401 in 20 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61b5859a-3436-47e6-b06e-c9f66d928164
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-61b5859a-3436-47e6-b06e-c9f66d928164"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bafeea00-d539-46db-b76f-90f13f4b5bfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bafeea00-d539-46db-b76f-90f13f4b5bfc
Content-Type: application/json

--- response: 204 in 42 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bafeea00-d539-46db-b76f-90f13f4b5bfc
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-cc6f20f0-6ebc-49fc-aa59-8f33ef1a0367

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc6f20f0-6ebc-49fc-aa59-8f33ef1a0367
Content-Type: application/json

--- request body ---
{"handle":"qa-660a55bbd48a","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc6f20f0-6ebc-49fc-aa59-8f33ef1a0367
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cc6f20f0-6ebc-49fc-aa59-8f33ef1a0367"}
```
