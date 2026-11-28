# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-fa870dd4-123a-40f9-8b81-45f679db9379` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-35d46494-1dd3-4f1e-b4d9-d3cc96fe8e0f` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-e57549b5-2e54-4a9f-8441-84819b78b355` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-6da00a6e-9716-4c6a-99d5-559a3d507fdd` |
| 5 | `POST /v1/conversations` | 422 | 10 | `qa-57bdcea3-575b-4a9a-8a4f-fc5dee30bcd9` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-5a44a3f0-fe80-4e92-8555-0fd3ee30811c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-ee8d2281-f542-4542-97ff-817d0e1f5513` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-26aa945e-63d1-42c3-af62-3a2004cf8e94` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-b272c41a-d091-4406-90dd-4108346a1310` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-c77e87ce-d26e-4b1f-a1c9-5a0e9d48d966` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fa870dd4-123a-40f9-8b81-45f679db9379

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa870dd4-123a-40f9-8b81-45f679db9379
Content-Type: application/json

--- request body ---
{"handle":"qa-2156e7b0b65d","displayName":"QA 2156e7b0b65d","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa870dd4-123a-40f9-8b81-45f679db9379
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 7
Location: /v1/accounts/qa-2156e7b0b65d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7a78e014-4a90-44b1-9147-5f843a47776e","handle":"qa-2156e7b0b65d","displayName":"QA 2156e7b0b65d","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.918558010Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-35d46494-1dd3-4f1e-b4d9-d3cc96fe8e0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35d46494-1dd3-4f1e-b4d9-d3cc96fe8e0f
Content-Type: application/json

--- request body ---
{"handle":"qa-6bd823fbedbf","displayName":"QA 6bd823fbedbf","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-35d46494-1dd3-4f1e-b4d9-d3cc96fe8e0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 7
Location: /v1/accounts/qa-6bd823fbedbf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3e57c8e4-0186-493b-83aa-a5d4ed300dfd","handle":"qa-6bd823fbedbf","displayName":"QA 6bd823fbedbf","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.987609531Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e57549b5-2e54-4a9f-8441-84819b78b355

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e57549b5-2e54-4a9f-8441-84819b78b355
Content-Type: application/json

--- request body ---
{"handle":"qa-2156e7b0b65d","password":"****"}

--- response: 200 in 45 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-e57549b5-2e54-4a9f-8441-84819b78b355
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7a78e014-4a90-44b1-9147-5f843a47776e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6da00a6e-9716-4c6a-99d5-559a3d507fdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6da00a6e-9716-4c6a-99d5-559a3d507fdd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6bd823fbedbf","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-6da00a6e-9716-4c6a-99d5-559a3d507fdd
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
Location: /v1/conversations/cnv_844e3b32-1a2c-45b8-a65c-14ab7ddb3f29
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_844e3b32-1a2c-45b8-a65c-14ab7ddb3f29","subject":"Error contract","status":"open","region":"eu","participants":["qa-2156e7b0b65d","qa-6bd823fbedbf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:46.073091365Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-57bdcea3-575b-4a9a-8a4f-fc5dee30bcd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57bdcea3-575b-4a9a-8a4f-fc5dee30bcd9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6bd823fbedbf","subject":" ","message":"Hi"}

--- response: 422 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57bdcea3-575b-4a9a-8a4f-fc5dee30bcd9
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-57bdcea3-575b-4a9a-8a4f-fc5dee30bcd9","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5a44a3f0-fe80-4e92-8555-0fd3ee30811c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a44a3f0-fe80-4e92-8555-0fd3ee30811c
Content-Type: application/json

--- request body ---
{"handle":"qa-6bd823fbedbf","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a44a3f0-fe80-4e92-8555-0fd3ee30811c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3e57c8e4-0186-493b-83aa-a5d4ed300dfd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ee8d2281-f542-4542-97ff-817d0e1f5513

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee8d2281-f542-4542-97ff-817d0e1f5513
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ee8d2281-f542-4542-97ff-817d0e1f5513
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
correlation: qa-26aa945e-63d1-42c3-af62-3a2004cf8e94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26aa945e-63d1-42c3-af62-3a2004cf8e94
Content-Type: application/json

--- request body ---
{"handle":"qa-6bd823fbedbf","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-26aa945e-63d1-42c3-af62-3a2004cf8e94
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-26aa945e-63d1-42c3-af62-3a2004cf8e94"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b272c41a-d091-4406-90dd-4108346a1310

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b272c41a-d091-4406-90dd-4108346a1310
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b272c41a-d091-4406-90dd-4108346a1310
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-c77e87ce-d26e-4b1f-a1c9-5a0e9d48d966

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c77e87ce-d26e-4b1f-a1c9-5a0e9d48d966
Content-Type: application/json

--- request body ---
{"handle":"qa-2156e7b0b65d","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c77e87ce-d26e-4b1f-a1c9-5a0e9d48d966
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c77e87ce-d26e-4b1f-a1c9-5a0e9d48d966"}
```
