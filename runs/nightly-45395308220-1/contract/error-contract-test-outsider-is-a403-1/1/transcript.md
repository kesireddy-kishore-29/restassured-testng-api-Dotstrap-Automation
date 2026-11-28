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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-92ac3554-b132-47d2-be73-e7e15a593cff` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-37d12081-ef27-4001-b69a-521f4291b066` |
| 3 | `POST /v1/accounts` | 201 | 31 | `qa-9eef2001-7dd8-4dbc-851b-bced31f8a57b` |
| 4 | `POST /v1/auth/token` | 200 | 23 | `qa-d1b43d94-463a-4b63-8678-53ab8d2950ee` |
| 5 | `POST /v1/conversations` | 201 | 13 | `qa-5da41126-f083-48bf-98d4-eb535ffe413f` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-e2b0bf22-f519-4ba4-b7f5-e16fecdff7bf` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 15 | `qa-e82a9eaa-6f19-45e3-9fda-cbf86e6dad99` |
| 8 | `DELETE /v1/accounts/me` | 204 | 47 | `qa-a6a00f45-bc82-4688-a15d-670b931f64e5` |
| 9 | `POST /v1/auth/token` | 401 | 19 | `qa-1c0f9804-9010-4e0d-b838-0aa1e621ebe9` |
| 10 | `POST /v1/auth/token` | 200 | 59 | `qa-a857afc0-00e1-439b-894b-48e199cd7264` |
| 11 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-9497c5d0-a254-4ff9-b0e3-e312bb037da9` |
| 12 | `POST /v1/auth/token` | 401 | 7 | `qa-776fa63f-ff24-4ea6-ac41-d6b33042ad46` |
| 13 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-284bfe06-3898-4314-9e78-e4a66eb53c8d` |
| 14 | `POST /v1/auth/token` | 401 | 20 | `qa-4d51c955-e6ff-400e-8d4d-1ac96dd6e085` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-92ac3554-b132-47d2-be73-e7e15a593cff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92ac3554-b132-47d2-be73-e7e15a593cff
Content-Type: application/json

--- request body ---
{"handle":"qa-2ab14124f0db","displayName":"QA 2ab14124f0db","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-92ac3554-b132-47d2-be73-e7e15a593cff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Location: /v1/accounts/qa-2ab14124f0db
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4eaf942f-0e09-4aba-9fc3-b3d75dd1b9ca","handle":"qa-2ab14124f0db","displayName":"QA 2ab14124f0db","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.375221655Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-37d12081-ef27-4001-b69a-521f4291b066

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37d12081-ef27-4001-b69a-521f4291b066
Content-Type: application/json

--- request body ---
{"handle":"qa-5c2c105cce93","displayName":"QA 5c2c105cce93","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-37d12081-ef27-4001-b69a-521f4291b066
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 9
Location: /v1/accounts/qa-5c2c105cce93
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9d16b155-0c70-4db1-bded-77e7b94fc337","handle":"qa-5c2c105cce93","displayName":"QA 5c2c105cce93","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.416428610Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-9eef2001-7dd8-4dbc-851b-bced31f8a57b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9eef2001-7dd8-4dbc-851b-bced31f8a57b
Content-Type: application/json

--- request body ---
{"handle":"qa-95465233f0e3","displayName":"QA 95465233f0e3","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-9eef2001-7dd8-4dbc-851b-bced31f8a57b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Location: /v1/accounts/qa-95465233f0e3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aaffe62f-087d-4452-94ca-9c8bf4d7cda2","handle":"qa-95465233f0e3","displayName":"QA 95465233f0e3","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.464760135Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-d1b43d94-463a-4b63-8678-53ab8d2950ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1b43d94-463a-4b63-8678-53ab8d2950ee
Content-Type: application/json

--- request body ---
{"handle":"qa-2ab14124f0db","password":"****"}

--- response: 200 in 23 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1b43d94-463a-4b63-8678-53ab8d2950ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4eaf942f-0e09-4aba-9fc3-b3d75dd1b9ca"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-5da41126-f083-48bf-98d4-eb535ffe413f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5da41126-f083-48bf-98d4-eb535ffe413f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5c2c105cce93","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-5da41126-f083-48bf-98d4-eb535ffe413f
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
Location: /v1/conversations/cnv_4b57192c-b059-489f-994c-fdb174a254b6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4b57192c-b059-489f-994c-fdb174a254b6","subject":"Error contract","status":"open","region":"eu","participants":["qa-2ab14124f0db","qa-5c2c105cce93"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:13.521630142Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e2b0bf22-f519-4ba4-b7f5-e16fecdff7bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2b0bf22-f519-4ba4-b7f5-e16fecdff7bf
Content-Type: application/json

--- request body ---
{"handle":"qa-95465233f0e3","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2b0bf22-f519-4ba4-b7f5-e16fecdff7bf
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aaffe62f-087d-4452-94ca-9c8bf4d7cda2"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_4b57192c-b059-489f-994c-fdb174a254b6/messages
correlation: qa-e82a9eaa-6f19-45e3-9fda-cbf86e6dad99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e82a9eaa-6f19-45e3-9fda-cbf86e6dad99
Content-Type: application/json

--- response: 403 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e82a9eaa-6f19-45e3-9fda-cbf86e6dad99
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_4b57192c-b059-489f-994c-fdb174a254b6/messages","correlationId":"qa-e82a9eaa-6f19-45e3-9fda-cbf86e6dad99"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a6a00f45-bc82-4688-a15d-670b931f64e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6a00f45-bc82-4688-a15d-670b931f64e5
Content-Type: application/json

--- response: 204 in 47 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a6a00f45-bc82-4688-a15d-670b931f64e5
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
correlation: qa-1c0f9804-9010-4e0d-b838-0aa1e621ebe9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c0f9804-9010-4e0d-b838-0aa1e621ebe9
Content-Type: application/json

--- request body ---
{"handle":"qa-95465233f0e3","password":"****"}

--- response: 401 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c0f9804-9010-4e0d-b838-0aa1e621ebe9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1c0f9804-9010-4e0d-b838-0aa1e621ebe9"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-a857afc0-00e1-439b-894b-48e199cd7264

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a857afc0-00e1-439b-894b-48e199cd7264
Content-Type: application/json

--- request body ---
{"handle":"qa-5c2c105cce93","password":"****"}

--- response: 200 in 59 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-a857afc0-00e1-439b-894b-48e199cd7264
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9d16b155-0c70-4db1-bded-77e7b94fc337"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9497c5d0-a254-4ff9-b0e3-e312bb037da9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9497c5d0-a254-4ff9-b0e3-e312bb037da9
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9497c5d0-a254-4ff9-b0e3-e312bb037da9
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
correlation: qa-776fa63f-ff24-4ea6-ac41-d6b33042ad46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-776fa63f-ff24-4ea6-ac41-d6b33042ad46
Content-Type: application/json

--- request body ---
{"handle":"qa-5c2c105cce93","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-776fa63f-ff24-4ea6-ac41-d6b33042ad46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-776fa63f-ff24-4ea6-ac41-d6b33042ad46"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-284bfe06-3898-4314-9e78-e4a66eb53c8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-284bfe06-3898-4314-9e78-e4a66eb53c8d
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-284bfe06-3898-4314-9e78-e4a66eb53c8d
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
correlation: qa-4d51c955-e6ff-400e-8d4d-1ac96dd6e085

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d51c955-e6ff-400e-8d4d-1ac96dd6e085
Content-Type: application/json

--- request body ---
{"handle":"qa-2ab14124f0db","password":"****"}

--- response: 401 in 20 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4d51c955-e6ff-400e-8d4d-1ac96dd6e085
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4d51c955-e6ff-400e-8d4d-1ac96dd6e085"}
```
