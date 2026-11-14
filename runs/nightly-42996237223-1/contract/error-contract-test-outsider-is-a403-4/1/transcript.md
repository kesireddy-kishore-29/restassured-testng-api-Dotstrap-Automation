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
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-b3a7b5dd-456d-4cff-bfa4-c467cc4c5105` |
| 2 | `POST /v1/accounts` | 201 | 62 | `qa-cac8b667-c066-407c-b97f-3b98ef9f4142` |
| 3 | `POST /v1/accounts` | 201 | 36 | `qa-c8450b42-9ecc-4940-a931-b389e40bc752` |
| 4 | `POST /v1/auth/token` | 200 | 47 | `qa-c7ddd4c6-30e4-4c17-a28d-d1bde015a24e` |
| 5 | `POST /v1/conversations` | 201 | 30 | `qa-072c0300-007e-46a9-b3d2-d9ed56b95cbf` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-d96f6060-75f2-452f-92ec-a3d8db8ec9db` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 10 | `qa-d5839ff2-c14a-49d8-bdff-ab41f586763e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-66639c13-2f55-4722-902b-98a3af3fccf7` |
| 9 | `POST /v1/auth/token` | 401 | 24 | `qa-78ebd9fe-cf7c-4a5f-840d-46ef9a54b7e0` |
| 10 | `POST /v1/auth/token` | 200 | 16 | `qa-3b67701f-a36f-4242-81a3-4ff54ad45872` |
| 11 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-2e393215-471d-461c-9865-d2089358bde2` |
| 12 | `POST /v1/auth/token` | 401 | 8 | `qa-e4920110-164c-432a-9e45-c10602231a0a` |
| 13 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-cad59ce3-8490-455f-b7dd-f8f5e3285e9f` |
| 14 | `POST /v1/auth/token` | 401 | 20 | `qa-a71ce508-41dc-4146-aab5-3a8f38c5b681` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b3a7b5dd-456d-4cff-bfa4-c467cc4c5105

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3a7b5dd-456d-4cff-bfa4-c467cc4c5105
Content-Type: application/json

--- request body ---
{"handle":"qa-22d2aaddbfdb","displayName":"QA 22d2aaddbfdb","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3a7b5dd-456d-4cff-bfa4-c467cc4c5105
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 8
Location: /v1/accounts/qa-22d2aaddbfdb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f9ad1f54-c5a0-488c-aabf-cac359f96f3d","handle":"qa-22d2aaddbfdb","displayName":"QA 22d2aaddbfdb","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.749734714Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cac8b667-c066-407c-b97f-3b98ef9f4142

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cac8b667-c066-407c-b97f-3b98ef9f4142
Content-Type: application/json

--- request body ---
{"handle":"qa-58539d18642d","displayName":"QA 58539d18642d","password":"****","region":"eu"}

--- response: 201 in 62 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-cac8b667-c066-407c-b97f-3b98ef9f4142
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 8
Location: /v1/accounts/qa-58539d18642d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1d942837-5615-48d4-ad81-355576b72138","handle":"qa-58539d18642d","displayName":"QA 58539d18642d","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.828266870Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-c8450b42-9ecc-4940-a931-b389e40bc752

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8450b42-9ecc-4940-a931-b389e40bc752
Content-Type: application/json

--- request body ---
{"handle":"qa-efa2879ce199","displayName":"QA efa2879ce199","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8450b42-9ecc-4940-a931-b389e40bc752
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 8
Location: /v1/accounts/qa-efa2879ce199
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c2d495cf-d58e-4348-be08-cb84a89311e8","handle":"qa-efa2879ce199","displayName":"QA efa2879ce199","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.875556038Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-c7ddd4c6-30e4-4c17-a28d-d1bde015a24e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7ddd4c6-30e4-4c17-a28d-d1bde015a24e
Content-Type: application/json

--- request body ---
{"handle":"qa-22d2aaddbfdb","password":"****"}

--- response: 200 in 47 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7ddd4c6-30e4-4c17-a28d-d1bde015a24e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f9ad1f54-c5a0-488c-aabf-cac359f96f3d"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-072c0300-007e-46a9-b3d2-d9ed56b95cbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-072c0300-007e-46a9-b3d2-d9ed56b95cbf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-58539d18642d","subject":"Error contract","message":"Hi"}

--- response: 201 in 30 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-072c0300-007e-46a9-b3d2-d9ed56b95cbf
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
Location: /v1/conversations/cnv_c83c022e-4dc3-45a6-b932-562fa3afa701
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c83c022e-4dc3-45a6-b932-562fa3afa701","subject":"Error contract","status":"open","region":"eu","participants":["qa-22d2aaddbfdb","qa-58539d18642d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:38.008139559Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d96f6060-75f2-452f-92ec-a3d8db8ec9db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d96f6060-75f2-452f-92ec-a3d8db8ec9db
Content-Type: application/json

--- request body ---
{"handle":"qa-efa2879ce199","password":"****"}

--- response: 200 in 35 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-d96f6060-75f2-452f-92ec-a3d8db8ec9db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c2d495cf-d58e-4348-be08-cb84a89311e8"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_c83c022e-4dc3-45a6-b932-562fa3afa701/close
correlation: qa-d5839ff2-c14a-49d8-bdff-ab41f586763e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5839ff2-c14a-49d8-bdff-ab41f586763e
Content-Type: application/json

--- response: 403 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5839ff2-c14a-49d8-bdff-ab41f586763e
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_c83c022e-4dc3-45a6-b932-562fa3afa701/close","correlationId":"qa-d5839ff2-c14a-49d8-bdff-ab41f586763e"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-66639c13-2f55-4722-902b-98a3af3fccf7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66639c13-2f55-4722-902b-98a3af3fccf7
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-66639c13-2f55-4722-902b-98a3af3fccf7
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
correlation: qa-78ebd9fe-cf7c-4a5f-840d-46ef9a54b7e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78ebd9fe-cf7c-4a5f-840d-46ef9a54b7e0
Content-Type: application/json

--- request body ---
{"handle":"qa-efa2879ce199","password":"****"}

--- response: 401 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-78ebd9fe-cf7c-4a5f-840d-46ef9a54b7e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-78ebd9fe-cf7c-4a5f-840d-46ef9a54b7e0"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-3b67701f-a36f-4242-81a3-4ff54ad45872

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b67701f-a36f-4242-81a3-4ff54ad45872
Content-Type: application/json

--- request body ---
{"handle":"qa-58539d18642d","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b67701f-a36f-4242-81a3-4ff54ad45872
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1d942837-5615-48d4-ad81-355576b72138"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2e393215-471d-461c-9865-d2089358bde2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e393215-471d-461c-9865-d2089358bde2
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2e393215-471d-461c-9865-d2089358bde2
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
correlation: qa-e4920110-164c-432a-9e45-c10602231a0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4920110-164c-432a-9e45-c10602231a0a
Content-Type: application/json

--- request body ---
{"handle":"qa-58539d18642d","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4920110-164c-432a-9e45-c10602231a0a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e4920110-164c-432a-9e45-c10602231a0a"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cad59ce3-8490-455f-b7dd-f8f5e3285e9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cad59ce3-8490-455f-b7dd-f8f5e3285e9f
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cad59ce3-8490-455f-b7dd-f8f5e3285e9f
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
correlation: qa-a71ce508-41dc-4146-aab5-3a8f38c5b681

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a71ce508-41dc-4146-aab5-3a8f38c5b681
Content-Type: application/json

--- request body ---
{"handle":"qa-22d2aaddbfdb","password":"****"}

--- response: 401 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a71ce508-41dc-4146-aab5-3a8f38c5b681
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a71ce508-41dc-4146-aab5-3a8f38c5b681"}
```
