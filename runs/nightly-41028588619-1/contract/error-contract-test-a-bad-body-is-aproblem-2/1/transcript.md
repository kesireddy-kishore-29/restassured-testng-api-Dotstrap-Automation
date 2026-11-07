# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 535 | `qa-584b5787-052e-4659-aa46-2117e7628173` |
| 2 | `POST /v1/accounts` | 201 | 57 | `qa-2225fdfe-dfe9-41de-876c-3d15ba6c1667` |
| 3 | `POST /v1/auth/token` | 200 | 69 | `qa-0c5169df-65af-43ab-be69-55ce67970574` |
| 4 | `POST /v1/conversations` | 201 | 91 | `qa-b05c5522-743d-4fef-bc6f-c499c707d078` |
| 5 | `POST /v1/auth/token` | 422 | 68 | `qa-43ecb36e-c06e-4149-84b5-c90fc3082e24` |
| 6 | `POST /v1/auth/token` | 200 | 92 | `qa-b4150784-bd14-48a3-abaf-217187fea1f3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 47 | `qa-7b72ddf5-1314-4edc-ba36-f3210bfc8fb1` |
| 8 | `POST /v1/auth/token` | 401 | 37 | `qa-cc8b0f5d-eed9-46c5-b0c1-7e3fcd92a875` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-f1f18f4c-bacc-4466-b199-483967b2a7cb` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-4db00c31-969d-47fb-b783-a95aaaddf07c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-584b5787-052e-4659-aa46-2117e7628173

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-584b5787-052e-4659-aa46-2117e7628173
Content-Type: application/json

--- request body ---
{"handle":"qa-6953cbcafb0a","displayName":"QA 6953cbcafb0a","password":"****","region":"eu"}

--- response: 201 in 535 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-584b5787-052e-4659-aa46-2117e7628173
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Location: /v1/accounts/qa-6953cbcafb0a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1506339a-ac44-4a11-977d-512060f1d036","handle":"qa-6953cbcafb0a","displayName":"QA 6953cbcafb0a","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.432981626Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2225fdfe-dfe9-41de-876c-3d15ba6c1667

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2225fdfe-dfe9-41de-876c-3d15ba6c1667
Content-Type: application/json

--- request body ---
{"handle":"qa-0c2559cb08a2","displayName":"QA 0c2559cb08a2","password":"****","region":"eu"}

--- response: 201 in 57 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-2225fdfe-dfe9-41de-876c-3d15ba6c1667
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
Location: /v1/accounts/qa-0c2559cb08a2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_997aa15b-2ff4-440a-9a0c-c0ab0ff52238","handle":"qa-0c2559cb08a2","displayName":"QA 0c2559cb08a2","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.845668752Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0c5169df-65af-43ab-be69-55ce67970574

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c5169df-65af-43ab-be69-55ce67970574
Content-Type: application/json

--- request body ---
{"handle":"qa-6953cbcafb0a","password":"****"}

--- response: 200 in 69 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c5169df-65af-43ab-be69-55ce67970574
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1506339a-ac44-4a11-977d-512060f1d036"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b05c5522-743d-4fef-bc6f-c499c707d078

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b05c5522-743d-4fef-bc6f-c499c707d078
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0c2559cb08a2","subject":"Error contract","message":"Hi"}

--- response: 201 in 91 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-b05c5522-743d-4fef-bc6f-c499c707d078
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
Location: /v1/conversations/cnv_f04d1051-9943-420c-8154-054decc5e93f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f04d1051-9943-420c-8154-054decc5e93f","subject":"Error contract","status":"open","region":"eu","participants":["qa-6953cbcafb0a","qa-0c2559cb08a2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:02.198930655Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-43ecb36e-c06e-4149-84b5-c90fc3082e24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43ecb36e-c06e-4149-84b5-c90fc3082e24
Content-Type: application/json

--- request body ---
{"handle":"qa-6953cbcafb0a","password":"****","ttlSeconds":0}

--- response: 422 in 68 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-43ecb36e-c06e-4149-84b5-c90fc3082e24
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-43ecb36e-c06e-4149-84b5-c90fc3082e24","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b4150784-bd14-48a3-abaf-217187fea1f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4150784-bd14-48a3-abaf-217187fea1f3
Content-Type: application/json

--- request body ---
{"handle":"qa-0c2559cb08a2","password":"****"}

--- response: 200 in 92 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4150784-bd14-48a3-abaf-217187fea1f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_997aa15b-2ff4-440a-9a0c-c0ab0ff52238"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7b72ddf5-1314-4edc-ba36-f3210bfc8fb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b72ddf5-1314-4edc-ba36-f3210bfc8fb1
Content-Type: application/json

--- response: 204 in 47 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7b72ddf5-1314-4edc-ba36-f3210bfc8fb1
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
correlation: qa-cc8b0f5d-eed9-46c5-b0c1-7e3fcd92a875

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc8b0f5d-eed9-46c5-b0c1-7e3fcd92a875
Content-Type: application/json

--- request body ---
{"handle":"qa-0c2559cb08a2","password":"****"}

--- response: 401 in 37 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc8b0f5d-eed9-46c5-b0c1-7e3fcd92a875
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cc8b0f5d-eed9-46c5-b0c1-7e3fcd92a875"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f1f18f4c-bacc-4466-b199-483967b2a7cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1f18f4c-bacc-4466-b199-483967b2a7cb
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f1f18f4c-bacc-4466-b199-483967b2a7cb
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-4db00c31-969d-47fb-b783-a95aaaddf07c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4db00c31-969d-47fb-b783-a95aaaddf07c
Content-Type: application/json

--- request body ---
{"handle":"qa-6953cbcafb0a","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4db00c31-969d-47fb-b783-a95aaaddf07c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4db00c31-969d-47fb-b783-a95aaaddf07c"}
```
