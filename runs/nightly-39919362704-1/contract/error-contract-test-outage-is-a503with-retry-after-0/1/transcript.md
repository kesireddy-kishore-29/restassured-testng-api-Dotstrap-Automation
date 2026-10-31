# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-ebe6eaae-3f63-4a9a-bbcc-68f9c7c2060f` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-21a53012-1e77-4c97-9d84-8fba7aa28920` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-969ed739-ae66-41ed-bf2f-4264c27b4903` |
| 4 | `POST /v1/conversations` | 201 | 41 | `qa-cadf5c2d-5d67-4092-b6c3-d37ad28c4d7c` |
| 5 | `POST /v1/auth/token` | 503 | 22 | `qa-1d087fb8-337f-4ab0-b212-257bd3fe5395` |
| 6 | `POST /v1/auth/token` | 200 | 67 | `qa-2b8f9d81-8210-487f-a97b-d692f8ede5cb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-e8c38509-12ac-4317-86ad-ff5bb70c6a30` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-211afd76-4246-4575-90a8-876ae12d789e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-ea1d554d-26dc-496c-9791-7cdca3d11b30` |
| 10 | `POST /v1/auth/token` | 401 | 29 | `qa-33a760b7-aa5a-452c-b66d-a5139eba7c36` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ebe6eaae-3f63-4a9a-bbcc-68f9c7c2060f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebe6eaae-3f63-4a9a-bbcc-68f9c7c2060f
Content-Type: application/json

--- request body ---
{"handle":"qa-faa1dda79865","displayName":"QA faa1dda79865","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebe6eaae-3f63-4a9a-bbcc-68f9c7c2060f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Location: /v1/accounts/qa-faa1dda79865
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8eff1f60-4e47-4d64-a7cd-e28a68c6e28f","handle":"qa-faa1dda79865","displayName":"QA faa1dda79865","region":"eu","role":"user","createdAt":"2026-10-23T07:41:43.762333349Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-21a53012-1e77-4c97-9d84-8fba7aa28920

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21a53012-1e77-4c97-9d84-8fba7aa28920
Content-Type: application/json

--- request body ---
{"handle":"qa-91371176128a","displayName":"QA 91371176128a","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-21a53012-1e77-4c97-9d84-8fba7aa28920
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Location: /v1/accounts/qa-91371176128a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0c5dacaa-52f1-41fe-be57-703deb5904d6","handle":"qa-91371176128a","displayName":"QA 91371176128a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:43.812929097Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-969ed739-ae66-41ed-bf2f-4264c27b4903

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-969ed739-ae66-41ed-bf2f-4264c27b4903
Content-Type: application/json

--- request body ---
{"handle":"qa-faa1dda79865","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-969ed739-ae66-41ed-bf2f-4264c27b4903
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8eff1f60-4e47-4d64-a7cd-e28a68c6e28f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cadf5c2d-5d67-4092-b6c3-d37ad28c4d7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cadf5c2d-5d67-4092-b6c3-d37ad28c4d7c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-91371176128a","subject":"Error contract","message":"Hi"}

--- response: 201 in 41 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-cadf5c2d-5d67-4092-b6c3-d37ad28c4d7c
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
Location: /v1/conversations/cnv_955bf499-b1f3-42a1-9d76-ff5eb488c367
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_955bf499-b1f3-42a1-9d76-ff5eb488c367","subject":"Error contract","status":"open","region":"eu","participants":["qa-faa1dda79865","qa-91371176128a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:43.940280969Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-1d087fb8-337f-4ab0-b212-257bd3fe5395

--- request headers ---
Accept: application/json
X-Fault-Key: 0ecc3a2a-5a4e-499f-8efa-10e275ef3371
X-Fault: unavailable-once
X-Correlation-Id: qa-1d087fb8-337f-4ab0-b212-257bd3fe5395
Content-Type: application/json

--- request body ---
{"handle":"qa-faa1dda79865","password":"****"}

--- response: 503 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d087fb8-337f-4ab0-b212-257bd3fe5395
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-1d087fb8-337f-4ab0-b212-257bd3fe5395"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2b8f9d81-8210-487f-a97b-d692f8ede5cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b8f9d81-8210-487f-a97b-d692f8ede5cb
Content-Type: application/json

--- request body ---
{"handle":"qa-91371176128a","password":"****"}

--- response: 200 in 67 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b8f9d81-8210-487f-a97b-d692f8ede5cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0c5dacaa-52f1-41fe-be57-703deb5904d6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e8c38509-12ac-4317-86ad-ff5bb70c6a30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8c38509-12ac-4317-86ad-ff5bb70c6a30
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e8c38509-12ac-4317-86ad-ff5bb70c6a30
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
correlation: qa-211afd76-4246-4575-90a8-876ae12d789e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-211afd76-4246-4575-90a8-876ae12d789e
Content-Type: application/json

--- request body ---
{"handle":"qa-91371176128a","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-211afd76-4246-4575-90a8-876ae12d789e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-211afd76-4246-4575-90a8-876ae12d789e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ea1d554d-26dc-496c-9791-7cdca3d11b30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea1d554d-26dc-496c-9791-7cdca3d11b30
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ea1d554d-26dc-496c-9791-7cdca3d11b30
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
correlation: qa-33a760b7-aa5a-452c-b66d-a5139eba7c36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33a760b7-aa5a-452c-b66d-a5139eba7c36
Content-Type: application/json

--- request body ---
{"handle":"qa-faa1dda79865","password":"****"}

--- response: 401 in 29 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-33a760b7-aa5a-452c-b66d-a5139eba7c36
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-33a760b7-aa5a-452c-b66d-a5139eba7c36"}
```
