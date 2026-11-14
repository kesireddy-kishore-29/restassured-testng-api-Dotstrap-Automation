# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-96f04517-0065-4469-841b-3e281a0f4b04` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-bc1de198-a688-454a-a98c-f87877da9646` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-85d0f70e-f03d-42be-bece-d0058fbaa00b` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-911e85a5-226e-48b4-b090-2eff4cd6fe87` |
| 5 | `POST /v1/accounts` | 422 | 18 | `qa-f1f04f04-d373-4df6-a56f-84282b01c3ff` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-0d197193-2217-4592-a3e7-ff151d941434` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-d6b4a249-0478-4747-b476-9d736b13de81` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-4f18126b-16af-427d-a973-7201558ce2ca` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-8df6febc-90bc-4658-9127-85bfae7e7805` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-6bac04df-4054-4707-a57d-0e5b7de8f915` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-96f04517-0065-4469-841b-3e281a0f4b04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96f04517-0065-4469-841b-3e281a0f4b04
Content-Type: application/json

--- request body ---
{"handle":"qa-9fc2f276d7fd","displayName":"QA 9fc2f276d7fd","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-96f04517-0065-4469-841b-3e281a0f4b04
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 8
Location: /v1/accounts/qa-9fc2f276d7fd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8a1512be-6c45-47f8-a31f-c00d0a2d5bc7","handle":"qa-9fc2f276d7fd","displayName":"QA 9fc2f276d7fd","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.303593782Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bc1de198-a688-454a-a98c-f87877da9646

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc1de198-a688-454a-a98c-f87877da9646
Content-Type: application/json

--- request body ---
{"handle":"qa-9ac45a8bc3d8","displayName":"QA 9ac45a8bc3d8","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc1de198-a688-454a-a98c-f87877da9646
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
Location: /v1/accounts/qa-9ac45a8bc3d8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_779272ff-5f55-4682-85de-03f47d1fa418","handle":"qa-9ac45a8bc3d8","displayName":"QA 9ac45a8bc3d8","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.348972761Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-85d0f70e-f03d-42be-bece-d0058fbaa00b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85d0f70e-f03d-42be-bece-d0058fbaa00b
Content-Type: application/json

--- request body ---
{"handle":"qa-9fc2f276d7fd","password":"****"}

--- response: 200 in 30 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-85d0f70e-f03d-42be-bece-d0058fbaa00b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8a1512be-6c45-47f8-a31f-c00d0a2d5bc7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-911e85a5-226e-48b4-b090-2eff4cd6fe87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-911e85a5-226e-48b4-b090-2eff4cd6fe87
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9ac45a8bc3d8","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-911e85a5-226e-48b4-b090-2eff4cd6fe87
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
Location: /v1/conversations/cnv_3938515f-78e9-4b9c-91ee-05469624f477
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3938515f-78e9-4b9c-91ee-05469624f477","subject":"Error contract","status":"open","region":"eu","participants":["qa-9fc2f276d7fd","qa-9ac45a8bc3d8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:36.420040161Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-f1f04f04-d373-4df6-a56f-84282b01c3ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1f04f04-d373-4df6-a56f-84282b01c3ff
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f1f04f04-d373-4df6-a56f-84282b01c3ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 8
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-f1f04f04-d373-4df6-a56f-84282b01c3ff","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0d197193-2217-4592-a3e7-ff151d941434

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d197193-2217-4592-a3e7-ff151d941434
Content-Type: application/json

--- request body ---
{"handle":"qa-9ac45a8bc3d8","password":"****"}

--- response: 200 in 27 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d197193-2217-4592-a3e7-ff151d941434
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_779272ff-5f55-4682-85de-03f47d1fa418"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d6b4a249-0478-4747-b476-9d736b13de81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6b4a249-0478-4747-b476-9d736b13de81
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d6b4a249-0478-4747-b476-9d736b13de81
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-4f18126b-16af-427d-a973-7201558ce2ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f18126b-16af-427d-a973-7201558ce2ca
Content-Type: application/json

--- request body ---
{"handle":"qa-9ac45a8bc3d8","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f18126b-16af-427d-a973-7201558ce2ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4f18126b-16af-427d-a973-7201558ce2ca"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8df6febc-90bc-4658-9127-85bfae7e7805

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8df6febc-90bc-4658-9127-85bfae7e7805
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8df6febc-90bc-4658-9127-85bfae7e7805
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-6bac04df-4054-4707-a57d-0e5b7de8f915

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bac04df-4054-4707-a57d-0e5b7de8f915
Content-Type: application/json

--- request body ---
{"handle":"qa-9fc2f276d7fd","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6bac04df-4054-4707-a57d-0e5b7de8f915
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6bac04df-4054-4707-a57d-0e5b7de8f915"}
```
