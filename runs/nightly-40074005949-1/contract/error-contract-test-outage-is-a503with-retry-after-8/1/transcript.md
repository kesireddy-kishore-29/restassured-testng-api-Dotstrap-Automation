# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-0b60f0cc-0252-4fe2-8446-be59522f6d4c` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-4f3063d1-ba7f-4612-bccc-42860ad31a93` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-029ddb40-15af-4b83-89a4-6a5baf6eee23` |
| 4 | `POST /v1/conversations` | 201 | 36 | `qa-2f6b504f-28ec-4bab-a3fb-49bb3ff41da0` |
| 5 | `GET /v1/conversations/{id}` | 503 | 24 | `qa-e9d74efe-e64b-4654-b374-46710b079d10` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-ac863a50-0b7d-4086-b0c3-44fa1a5c8481` |
| 7 | `DELETE /v1/accounts/me` | 204 | 51 | `qa-2d3a1823-fe1f-4180-87b9-8c30fcf15794` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-aba5f4b6-cc82-4834-8841-022a59032592` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-6d93cff3-f72f-4667-a91b-0ae21cef83d2` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-e7ef1d77-aa11-4984-a723-43792bef3d0c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0b60f0cc-0252-4fe2-8446-be59522f6d4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b60f0cc-0252-4fe2-8446-be59522f6d4c
Content-Type: application/json

--- request body ---
{"handle":"qa-60c7f41312c4","displayName":"QA 60c7f41312c4","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b60f0cc-0252-4fe2-8446-be59522f6d4c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 8
Location: /v1/accounts/qa-60c7f41312c4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dcba0312-80c8-4150-8122-ca833f854225","handle":"qa-60c7f41312c4","displayName":"QA 60c7f41312c4","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.279236995Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4f3063d1-ba7f-4612-bccc-42860ad31a93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f3063d1-ba7f-4612-bccc-42860ad31a93
Content-Type: application/json

--- request body ---
{"handle":"qa-ddff0686a046","displayName":"QA ddff0686a046","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f3063d1-ba7f-4612-bccc-42860ad31a93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 8
Location: /v1/accounts/qa-ddff0686a046
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4985f050-f59a-49d9-8b34-512b58fadacb","handle":"qa-ddff0686a046","displayName":"QA ddff0686a046","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.317853385Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-029ddb40-15af-4b83-89a4-6a5baf6eee23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-029ddb40-15af-4b83-89a4-6a5baf6eee23
Content-Type: application/json

--- request body ---
{"handle":"qa-60c7f41312c4","password":"****"}

--- response: 200 in 18 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-029ddb40-15af-4b83-89a4-6a5baf6eee23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dcba0312-80c8-4150-8122-ca833f854225"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2f6b504f-28ec-4bab-a3fb-49bb3ff41da0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f6b504f-28ec-4bab-a3fb-49bb3ff41da0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ddff0686a046","subject":"Error contract","message":"Hi"}

--- response: 201 in 36 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f6b504f-28ec-4bab-a3fb-49bb3ff41da0
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
Location: /v1/conversations/cnv_178bfae4-35ac-4dd9-9d30-7dbe6a1c3015
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_178bfae4-35ac-4dd9-9d30-7dbe6a1c3015","subject":"Error contract","status":"open","region":"eu","participants":["qa-60c7f41312c4","qa-ddff0686a046"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.379039139Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_178bfae4-35ac-4dd9-9d30-7dbe6a1c3015
correlation: qa-e9d74efe-e64b-4654-b374-46710b079d10

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 9788437e-de4a-4705-b847-8fbb79522b04
X-Correlation-Id: qa-e9d74efe-e64b-4654-b374-46710b079d10
Content-Type: application/json

--- response: 503 in 24 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9d74efe-e64b-4654-b374-46710b079d10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_178bfae4-35ac-4dd9-9d30-7dbe6a1c3015","correlationId":"qa-e9d74efe-e64b-4654-b374-46710b079d10"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ac863a50-0b7d-4086-b0c3-44fa1a5c8481

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac863a50-0b7d-4086-b0c3-44fa1a5c8481
Content-Type: application/json

--- request body ---
{"handle":"qa-ddff0686a046","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac863a50-0b7d-4086-b0c3-44fa1a5c8481
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4985f050-f59a-49d9-8b34-512b58fadacb"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2d3a1823-fe1f-4180-87b9-8c30fcf15794

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d3a1823-fe1f-4180-87b9-8c30fcf15794
Content-Type: application/json

--- response: 204 in 51 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2d3a1823-fe1f-4180-87b9-8c30fcf15794
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
correlation: qa-aba5f4b6-cc82-4834-8841-022a59032592

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aba5f4b6-cc82-4834-8841-022a59032592
Content-Type: application/json

--- request body ---
{"handle":"qa-ddff0686a046","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aba5f4b6-cc82-4834-8841-022a59032592
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aba5f4b6-cc82-4834-8841-022a59032592"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6d93cff3-f72f-4667-a91b-0ae21cef83d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d93cff3-f72f-4667-a91b-0ae21cef83d2
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6d93cff3-f72f-4667-a91b-0ae21cef83d2
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
correlation: qa-e7ef1d77-aa11-4984-a723-43792bef3d0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7ef1d77-aa11-4984-a723-43792bef3d0c
Content-Type: application/json

--- request body ---
{"handle":"qa-60c7f41312c4","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e7ef1d77-aa11-4984-a723-43792bef3d0c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e7ef1d77-aa11-4984-a723-43792bef3d0c"}
```
