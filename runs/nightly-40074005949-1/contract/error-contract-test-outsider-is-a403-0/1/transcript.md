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
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-fe8fee57-038e-416e-91d9-704e696dd95c` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-7dd3289b-5d01-45cf-a5c0-85c40e61dadf` |
| 3 | `POST /v1/accounts` | 201 | 50 | `qa-677637a9-0810-48cf-8265-df84e8826b87` |
| 4 | `POST /v1/auth/token` | 200 | 19 | `qa-9930a8f1-6d20-4b51-af03-685357ff9761` |
| 5 | `POST /v1/conversations` | 201 | 12 | `qa-582e92e2-026d-4b95-85e8-7697b1b56db5` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-e1740653-0f79-4f29-9694-c9df1f1670b5` |
| 7 | `GET /v1/conversations/{id}` | 403 | 13 | `qa-2984a5a4-56a6-4452-978a-ad4ec50387a0` |
| 8 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-09e3044f-8d89-43da-b48a-d8094cf1c45d` |
| 9 | `POST /v1/auth/token` | 401 | 34 | `qa-c1319581-9aa8-4725-b933-7d3cba12a3f6` |
| 10 | `POST /v1/auth/token` | 200 | 39 | `qa-f68c7a4f-c654-4b30-82c7-60a26207ba53` |
| 11 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-cb450fc0-0c97-4cf7-8dc1-63b0f5fc0277` |
| 12 | `POST /v1/auth/token` | 401 | 16 | `qa-ccd3cbb0-ed95-4624-ac27-fab169edfc3c` |
| 13 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-2372fa66-a032-4e78-8447-374940fe6669` |
| 14 | `POST /v1/auth/token` | 401 | 10 | `qa-3290a5c3-9074-49ea-9e5e-454776f35a67` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fe8fee57-038e-416e-91d9-704e696dd95c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe8fee57-038e-416e-91d9-704e696dd95c
Content-Type: application/json

--- request body ---
{"handle":"qa-14ebbef976a4","displayName":"QA 14ebbef976a4","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe8fee57-038e-416e-91d9-704e696dd95c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Location: /v1/accounts/qa-14ebbef976a4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d7250ee2-7c74-4b9d-bf24-06c4851e1a37","handle":"qa-14ebbef976a4","displayName":"QA 14ebbef976a4","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.835723934Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7dd3289b-5d01-45cf-a5c0-85c40e61dadf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dd3289b-5d01-45cf-a5c0-85c40e61dadf
Content-Type: application/json

--- request body ---
{"handle":"qa-d0021c829616","displayName":"QA d0021c829616","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-7dd3289b-5d01-45cf-a5c0-85c40e61dadf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 10
Location: /v1/accounts/qa-d0021c829616
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88895435-3919-456e-9647-05d857256843","handle":"qa-d0021c829616","displayName":"QA d0021c829616","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.874483178Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-677637a9-0810-48cf-8265-df84e8826b87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-677637a9-0810-48cf-8265-df84e8826b87
Content-Type: application/json

--- request body ---
{"handle":"qa-8f68629e06cd","displayName":"QA 8f68629e06cd","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-677637a9-0810-48cf-8265-df84e8826b87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 10
Location: /v1/accounts/qa-8f68629e06cd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_435b28b8-4fce-4705-90b4-e2969381ec5b","handle":"qa-8f68629e06cd","displayName":"QA 8f68629e06cd","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.910778297Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-9930a8f1-6d20-4b51-af03-685357ff9761

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9930a8f1-6d20-4b51-af03-685357ff9761
Content-Type: application/json

--- request body ---
{"handle":"qa-14ebbef976a4","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-9930a8f1-6d20-4b51-af03-685357ff9761
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d7250ee2-7c74-4b9d-bf24-06c4851e1a37"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-582e92e2-026d-4b95-85e8-7697b1b56db5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-582e92e2-026d-4b95-85e8-7697b1b56db5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d0021c829616","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-582e92e2-026d-4b95-85e8-7697b1b56db5
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
Location: /v1/conversations/cnv_6bbdf566-6867-437c-8887-925debbd50e0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6bbdf566-6867-437c-8887-925debbd50e0","subject":"Error contract","status":"open","region":"eu","participants":["qa-14ebbef976a4","qa-d0021c829616"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:01.994921385Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e1740653-0f79-4f29-9694-c9df1f1670b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1740653-0f79-4f29-9694-c9df1f1670b5
Content-Type: application/json

--- request body ---
{"handle":"qa-8f68629e06cd","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1740653-0f79-4f29-9694-c9df1f1670b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_435b28b8-4fce-4705-90b4-e2969381ec5b"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_6bbdf566-6867-437c-8887-925debbd50e0
correlation: qa-2984a5a4-56a6-4452-978a-ad4ec50387a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2984a5a4-56a6-4452-978a-ad4ec50387a0
Content-Type: application/json

--- response: 403 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2984a5a4-56a6-4452-978a-ad4ec50387a0
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_6bbdf566-6867-437c-8887-925debbd50e0","correlationId":"qa-2984a5a4-56a6-4452-978a-ad4ec50387a0"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-09e3044f-8d89-43da-b48a-d8094cf1c45d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09e3044f-8d89-43da-b48a-d8094cf1c45d
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-09e3044f-8d89-43da-b48a-d8094cf1c45d
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
correlation: qa-c1319581-9aa8-4725-b933-7d3cba12a3f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1319581-9aa8-4725-b933-7d3cba12a3f6
Content-Type: application/json

--- request body ---
{"handle":"qa-8f68629e06cd","password":"****"}

--- response: 401 in 34 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1319581-9aa8-4725-b933-7d3cba12a3f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c1319581-9aa8-4725-b933-7d3cba12a3f6"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-f68c7a4f-c654-4b30-82c7-60a26207ba53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f68c7a4f-c654-4b30-82c7-60a26207ba53
Content-Type: application/json

--- request body ---
{"handle":"qa-d0021c829616","password":"****"}

--- response: 200 in 39 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f68c7a4f-c654-4b30-82c7-60a26207ba53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_88895435-3919-456e-9647-05d857256843"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cb450fc0-0c97-4cf7-8dc1-63b0f5fc0277

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb450fc0-0c97-4cf7-8dc1-63b0f5fc0277
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cb450fc0-0c97-4cf7-8dc1-63b0f5fc0277
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
correlation: qa-ccd3cbb0-ed95-4624-ac27-fab169edfc3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccd3cbb0-ed95-4624-ac27-fab169edfc3c
Content-Type: application/json

--- request body ---
{"handle":"qa-d0021c829616","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ccd3cbb0-ed95-4624-ac27-fab169edfc3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ccd3cbb0-ed95-4624-ac27-fab169edfc3c"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2372fa66-a032-4e78-8447-374940fe6669

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2372fa66-a032-4e78-8447-374940fe6669
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2372fa66-a032-4e78-8447-374940fe6669
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
correlation: qa-3290a5c3-9074-49ea-9e5e-454776f35a67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3290a5c3-9074-49ea-9e5e-454776f35a67
Content-Type: application/json

--- request body ---
{"handle":"qa-14ebbef976a4","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3290a5c3-9074-49ea-9e5e-454776f35a67
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3290a5c3-9074-49ea-9e5e-454776f35a67"}
```
