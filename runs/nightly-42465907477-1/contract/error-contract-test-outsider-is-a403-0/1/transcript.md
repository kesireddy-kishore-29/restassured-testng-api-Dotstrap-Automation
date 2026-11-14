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
| 1 | `POST /v1/accounts` | 201 | 51 | `qa-f7f2a6b2-13ff-4e67-8671-6ed687d5b2ff` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-f2817e7a-8a88-4fe2-9db7-e436f250f706` |
| 3 | `POST /v1/accounts` | 201 | 12 | `qa-7a923249-c105-4175-88b8-751e163b72e6` |
| 4 | `POST /v1/auth/token` | 200 | 30 | `qa-78b7be24-a6e3-4e0d-8624-cc36795b5285` |
| 5 | `POST /v1/conversations` | 201 | 12 | `qa-c2ee8575-b733-4bd9-94ed-2ebe08a2c8e6` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-5e38a924-15bf-474c-9aea-94db5dff843b` |
| 7 | `GET /v1/conversations/{id}` | 403 | 12 | `qa-cb27252c-def6-445b-bac7-127703313518` |
| 8 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-c089721c-f2d2-49eb-aa4f-c4ecee79c9b1` |
| 9 | `POST /v1/auth/token` | 401 | 11 | `qa-5034fb71-2bde-4b0b-af32-e59446cf387d` |
| 10 | `POST /v1/auth/token` | 200 | 17 | `qa-d96aad73-0b17-4d79-8781-a5324194c599` |
| 11 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-2fee7c26-b182-47d0-b6b9-7347bd49c5b7` |
| 12 | `POST /v1/auth/token` | 401 | 31 | `qa-5b9dce3d-dde6-4f9e-aa2d-e8d6a1b527f2` |
| 13 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-24bf303c-9a49-4abf-af3e-eb4cc402a583` |
| 14 | `POST /v1/auth/token` | 401 | 15 | `qa-9fbf4f3e-4dfa-4c1f-80fa-38ccd95244a9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f7f2a6b2-13ff-4e67-8671-6ed687d5b2ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7f2a6b2-13ff-4e67-8671-6ed687d5b2ff
Content-Type: application/json

--- request body ---
{"handle":"qa-d5f8c90a8dd5","displayName":"QA d5f8c90a8dd5","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7f2a6b2-13ff-4e67-8671-6ed687d5b2ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Location: /v1/accounts/qa-d5f8c90a8dd5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_08a6539c-deca-4b7f-b035-741abce4ea74","handle":"qa-d5f8c90a8dd5","displayName":"QA d5f8c90a8dd5","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.747302888Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f2817e7a-8a88-4fe2-9db7-e436f250f706

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2817e7a-8a88-4fe2-9db7-e436f250f706
Content-Type: application/json

--- request body ---
{"handle":"qa-41e5eeefe691","displayName":"QA 41e5eeefe691","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2817e7a-8a88-4fe2-9db7-e436f250f706
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 10
Location: /v1/accounts/qa-41e5eeefe691
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ccdb1743-4341-40c6-87b4-149d5084a812","handle":"qa-41e5eeefe691","displayName":"QA 41e5eeefe691","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.813912639Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-7a923249-c105-4175-88b8-751e163b72e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a923249-c105-4175-88b8-751e163b72e6
Content-Type: application/json

--- request body ---
{"handle":"qa-f7eef0221118","displayName":"QA f7eef0221118","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a923249-c105-4175-88b8-751e163b72e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 10
Location: /v1/accounts/qa-f7eef0221118
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1e6da3b9-7469-4da1-91ea-d0d4b71536a7","handle":"qa-f7eef0221118","displayName":"QA f7eef0221118","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.835210820Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-78b7be24-a6e3-4e0d-8624-cc36795b5285

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78b7be24-a6e3-4e0d-8624-cc36795b5285
Content-Type: application/json

--- request body ---
{"handle":"qa-d5f8c90a8dd5","password":"****"}

--- response: 200 in 30 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-78b7be24-a6e3-4e0d-8624-cc36795b5285
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_08a6539c-deca-4b7f-b035-741abce4ea74"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-c2ee8575-b733-4bd9-94ed-2ebe08a2c8e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2ee8575-b733-4bd9-94ed-2ebe08a2c8e6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-41e5eeefe691","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2ee8575-b733-4bd9-94ed-2ebe08a2c8e6
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
Location: /v1/conversations/cnv_ddc2b8ae-2c66-4988-83b1-4ff979388d26
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ddc2b8ae-2c66-4988-83b1-4ff979388d26","subject":"Error contract","status":"open","region":"eu","participants":["qa-d5f8c90a8dd5","qa-41e5eeefe691"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:01.903529422Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5e38a924-15bf-474c-9aea-94db5dff843b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e38a924-15bf-474c-9aea-94db5dff843b
Content-Type: application/json

--- request body ---
{"handle":"qa-f7eef0221118","password":"****"}

--- response: 200 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e38a924-15bf-474c-9aea-94db5dff843b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1e6da3b9-7469-4da1-91ea-d0d4b71536a7"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_ddc2b8ae-2c66-4988-83b1-4ff979388d26
correlation: qa-cb27252c-def6-445b-bac7-127703313518

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb27252c-def6-445b-bac7-127703313518
Content-Type: application/json

--- response: 403 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb27252c-def6-445b-bac7-127703313518
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_ddc2b8ae-2c66-4988-83b1-4ff979388d26","correlationId":"qa-cb27252c-def6-445b-bac7-127703313518"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c089721c-f2d2-49eb-aa4f-c4ecee79c9b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c089721c-f2d2-49eb-aa4f-c4ecee79c9b1
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c089721c-f2d2-49eb-aa4f-c4ecee79c9b1
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
correlation: qa-5034fb71-2bde-4b0b-af32-e59446cf387d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5034fb71-2bde-4b0b-af32-e59446cf387d
Content-Type: application/json

--- request body ---
{"handle":"qa-f7eef0221118","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5034fb71-2bde-4b0b-af32-e59446cf387d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5034fb71-2bde-4b0b-af32-e59446cf387d"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-d96aad73-0b17-4d79-8781-a5324194c599

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d96aad73-0b17-4d79-8781-a5324194c599
Content-Type: application/json

--- request body ---
{"handle":"qa-41e5eeefe691","password":"****"}

--- response: 200 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d96aad73-0b17-4d79-8781-a5324194c599
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ccdb1743-4341-40c6-87b4-149d5084a812"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2fee7c26-b182-47d0-b6b9-7347bd49c5b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fee7c26-b182-47d0-b6b9-7347bd49c5b7
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2fee7c26-b182-47d0-b6b9-7347bd49c5b7
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
correlation: qa-5b9dce3d-dde6-4f9e-aa2d-e8d6a1b527f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b9dce3d-dde6-4f9e-aa2d-e8d6a1b527f2
Content-Type: application/json

--- request body ---
{"handle":"qa-41e5eeefe691","password":"****"}

--- response: 401 in 31 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b9dce3d-dde6-4f9e-aa2d-e8d6a1b527f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b9dce3d-dde6-4f9e-aa2d-e8d6a1b527f2"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-24bf303c-9a49-4abf-af3e-eb4cc402a583

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24bf303c-9a49-4abf-af3e-eb4cc402a583
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-24bf303c-9a49-4abf-af3e-eb4cc402a583
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
correlation: qa-9fbf4f3e-4dfa-4c1f-80fa-38ccd95244a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fbf4f3e-4dfa-4c1f-80fa-38ccd95244a9
Content-Type: application/json

--- request body ---
{"handle":"qa-d5f8c90a8dd5","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9fbf4f3e-4dfa-4c1f-80fa-38ccd95244a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9fbf4f3e-4dfa-4c1f-80fa-38ccd95244a9"}
```
