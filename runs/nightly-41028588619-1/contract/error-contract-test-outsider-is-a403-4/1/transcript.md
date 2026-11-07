# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-79da93c0-3d9e-41a0-a06c-fa12f0c4c152` |
| 2 | `POST /v1/accounts` | 201 | 63 | `qa-195c9ed2-04b1-40c5-a21a-b8e50a6c656d` |
| 3 | `POST /v1/accounts` | 201 | 50 | `qa-4ce23c3e-f548-40ff-9a4e-09baf7ca7d24` |
| 4 | `POST /v1/auth/token` | 200 | 60 | `qa-3c13d279-5924-4bc3-97a3-30b0379420fa` |
| 5 | `POST /v1/conversations` | 201 | 41 | `qa-854f62c0-8142-4305-a2fa-0432976a956a` |
| 6 | `POST /v1/auth/token` | 200 | 88 | `qa-0a510832-0a60-4a33-a93e-ed60cfab167d` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 33 | `qa-dc229ab5-137c-40be-bc8d-b0e1c7e04ef8` |
| 8 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-fa4c641b-b791-4fad-b540-7a14ed2464e7` |
| 9 | `POST /v1/auth/token` | 401 | 11 | `qa-c76e8f66-75b5-44da-ad64-ae436487f967` |
| 10 | `POST /v1/auth/token` | 200 | 50 | `qa-c59259a4-6add-43c1-a634-4fe6d16d6511` |
| 11 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-b6c73571-b8a7-489f-a52e-98d62a661302` |
| 12 | `POST /v1/auth/token` | 401 | 11 | `qa-03720c6c-d6f1-4d6f-be8d-706d9cec66df` |
| 13 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-2f4b8bbf-3fd9-4369-826d-d246e7ec7145` |
| 14 | `POST /v1/auth/token` | 401 | 10 | `qa-4c00db13-756e-4c62-82b3-1fc195ab8016` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-79da93c0-3d9e-41a0-a06c-fa12f0c4c152

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79da93c0-3d9e-41a0-a06c-fa12f0c4c152
Content-Type: application/json

--- request body ---
{"handle":"qa-9050924259e7","displayName":"QA 9050924259e7","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-79da93c0-3d9e-41a0-a06c-fa12f0c4c152
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 8
Location: /v1/accounts/qa-9050924259e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b448287f-0328-41de-ac41-fd98fe77794a","handle":"qa-9050924259e7","displayName":"QA 9050924259e7","region":"eu","role":"user","createdAt":"2026-10-30T08:46:03.839891010Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-195c9ed2-04b1-40c5-a21a-b8e50a6c656d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-195c9ed2-04b1-40c5-a21a-b8e50a6c656d
Content-Type: application/json

--- request body ---
{"handle":"qa-ea6254f3df81","displayName":"QA ea6254f3df81","password":"****","region":"eu"}

--- response: 201 in 63 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-195c9ed2-04b1-40c5-a21a-b8e50a6c656d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 8
Location: /v1/accounts/qa-ea6254f3df81
X-Served-Region: eu
Content-Length: 181

{"id":"acc_96af4bdb-ac2d-4024-ac2f-9f6a8e89b029","handle":"qa-ea6254f3df81","displayName":"QA ea6254f3df81","region":"eu","role":"user","createdAt":"2026-10-30T08:46:03.916551022Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-4ce23c3e-f548-40ff-9a4e-09baf7ca7d24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ce23c3e-f548-40ff-9a4e-09baf7ca7d24
Content-Type: application/json

--- request body ---
{"handle":"qa-c63f84e3a3e0","displayName":"QA c63f84e3a3e0","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ce23c3e-f548-40ff-9a4e-09baf7ca7d24
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 8
Location: /v1/accounts/qa-c63f84e3a3e0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dd843815-290a-4c15-8675-65d661618d61","handle":"qa-c63f84e3a3e0","displayName":"QA c63f84e3a3e0","region":"eu","role":"user","createdAt":"2026-10-30T08:46:03.997453001Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-3c13d279-5924-4bc3-97a3-30b0379420fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c13d279-5924-4bc3-97a3-30b0379420fa
Content-Type: application/json

--- request body ---
{"handle":"qa-9050924259e7","password":"****"}

--- response: 200 in 60 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c13d279-5924-4bc3-97a3-30b0379420fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b448287f-0328-41de-ac41-fd98fe77794a"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-854f62c0-8142-4305-a2fa-0432976a956a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-854f62c0-8142-4305-a2fa-0432976a956a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ea6254f3df81","subject":"Error contract","message":"Hi"}

--- response: 201 in 41 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-854f62c0-8142-4305-a2fa-0432976a956a
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
Location: /v1/conversations/cnv_6e7bcdf5-8c3d-4250-9711-f2ed37541dd3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6e7bcdf5-8c3d-4250-9711-f2ed37541dd3","subject":"Error contract","status":"open","region":"eu","participants":["qa-9050924259e7","qa-ea6254f3df81"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:04.205360794Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0a510832-0a60-4a33-a93e-ed60cfab167d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a510832-0a60-4a33-a93e-ed60cfab167d
Content-Type: application/json

--- request body ---
{"handle":"qa-c63f84e3a3e0","password":"****"}

--- response: 200 in 88 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a510832-0a60-4a33-a93e-ed60cfab167d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dd843815-290a-4c15-8675-65d661618d61"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_6e7bcdf5-8c3d-4250-9711-f2ed37541dd3/close
correlation: qa-dc229ab5-137c-40be-bc8d-b0e1c7e04ef8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc229ab5-137c-40be-bc8d-b0e1c7e04ef8
Content-Type: application/json

--- response: 403 in 33 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc229ab5-137c-40be-bc8d-b0e1c7e04ef8
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_6e7bcdf5-8c3d-4250-9711-f2ed37541dd3/close","correlationId":"qa-dc229ab5-137c-40be-bc8d-b0e1c7e04ef8"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fa4c641b-b791-4fad-b540-7a14ed2464e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa4c641b-b791-4fad-b540-7a14ed2464e7
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fa4c641b-b791-4fad-b540-7a14ed2464e7
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
correlation: qa-c76e8f66-75b5-44da-ad64-ae436487f967

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c76e8f66-75b5-44da-ad64-ae436487f967
Content-Type: application/json

--- request body ---
{"handle":"qa-c63f84e3a3e0","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c76e8f66-75b5-44da-ad64-ae436487f967
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c76e8f66-75b5-44da-ad64-ae436487f967"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-c59259a4-6add-43c1-a634-4fe6d16d6511

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c59259a4-6add-43c1-a634-4fe6d16d6511
Content-Type: application/json

--- request body ---
{"handle":"qa-ea6254f3df81","password":"****"}

--- response: 200 in 50 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-c59259a4-6add-43c1-a634-4fe6d16d6511
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_96af4bdb-ac2d-4024-ac2f-9f6a8e89b029"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b6c73571-b8a7-489f-a52e-98d62a661302

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6c73571-b8a7-489f-a52e-98d62a661302
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b6c73571-b8a7-489f-a52e-98d62a661302
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
correlation: qa-03720c6c-d6f1-4d6f-be8d-706d9cec66df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03720c6c-d6f1-4d6f-be8d-706d9cec66df
Content-Type: application/json

--- request body ---
{"handle":"qa-ea6254f3df81","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03720c6c-d6f1-4d6f-be8d-706d9cec66df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-03720c6c-d6f1-4d6f-be8d-706d9cec66df"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2f4b8bbf-3fd9-4369-826d-d246e7ec7145

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f4b8bbf-3fd9-4369-826d-d246e7ec7145
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2f4b8bbf-3fd9-4369-826d-d246e7ec7145
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
correlation: qa-4c00db13-756e-4c62-82b3-1fc195ab8016

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c00db13-756e-4c62-82b3-1fc195ab8016
Content-Type: application/json

--- request body ---
{"handle":"qa-9050924259e7","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c00db13-756e-4c62-82b3-1fc195ab8016
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4c00db13-756e-4c62-82b3-1fc195ab8016"}
```
