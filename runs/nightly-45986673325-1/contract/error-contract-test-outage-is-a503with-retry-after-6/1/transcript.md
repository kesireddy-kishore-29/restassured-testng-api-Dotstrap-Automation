# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 78 | `qa-486605d7-8d46-4860-8bc9-1237b5c18761` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-6ecc48fe-dfba-427f-97df-d084f7034959` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-013bc7e7-b2f9-4a8d-acee-def17a06a585` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-96d8909e-b663-45ef-a148-c64f01d08537` |
| 5 | `POST /v1/conversations` | 503 | 33 | `qa-5be1da5c-dfc3-4b37-b6d8-0cd3e15afa2d` |
| 6 | `POST /v1/auth/token` | 200 | 80 | `qa-7a18255a-7401-449b-8317-21b0e6028884` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-a0051cac-53c8-4522-8bd3-cc103c87d799` |
| 8 | `POST /v1/auth/token` | 401 | 31 | `qa-7ded3ecf-4ce9-497b-abf9-67099f2ae54a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-abb18e25-9297-4d36-83ae-0e94e2e20a85` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-7195ad89-6748-44c4-8bc2-16705362170b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-486605d7-8d46-4860-8bc9-1237b5c18761

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-486605d7-8d46-4860-8bc9-1237b5c18761
Content-Type: application/json

--- request body ---
{"handle":"qa-9f490b56ff64","displayName":"QA 9f490b56ff64","password":"****","region":"eu"}

--- response: 201 in 78 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-486605d7-8d46-4860-8bc9-1237b5c18761
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Location: /v1/accounts/qa-9f490b56ff64
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d3d0de8e-a961-4175-97f3-c29197e7e36e","handle":"qa-9f490b56ff64","displayName":"QA 9f490b56ff64","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.643638068Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6ecc48fe-dfba-427f-97df-d084f7034959

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ecc48fe-dfba-427f-97df-d084f7034959
Content-Type: application/json

--- request body ---
{"handle":"qa-4e9ac5ea922e","displayName":"QA 4e9ac5ea922e","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ecc48fe-dfba-427f-97df-d084f7034959
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
Location: /v1/accounts/qa-4e9ac5ea922e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_60104399-f681-4877-8c0a-56e0204269de","handle":"qa-4e9ac5ea922e","displayName":"QA 4e9ac5ea922e","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.722327588Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-013bc7e7-b2f9-4a8d-acee-def17a06a585

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-013bc7e7-b2f9-4a8d-acee-def17a06a585
Content-Type: application/json

--- request body ---
{"handle":"qa-9f490b56ff64","password":"****"}

--- response: 200 in 45 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-013bc7e7-b2f9-4a8d-acee-def17a06a585
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d3d0de8e-a961-4175-97f3-c29197e7e36e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-96d8909e-b663-45ef-a148-c64f01d08537

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96d8909e-b663-45ef-a148-c64f01d08537
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4e9ac5ea922e","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-96d8909e-b663-45ef-a148-c64f01d08537
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
Location: /v1/conversations/cnv_76d8be6b-608c-4eb3-b868-86a069a598b4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_76d8be6b-608c-4eb3-b868-86a069a598b4","subject":"Error contract","status":"open","region":"eu","participants":["qa-9f490b56ff64","qa-4e9ac5ea922e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:58.811628265Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-5be1da5c-dfc3-4b37-b6d8-0cd3e15afa2d

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 1fb4c308-aaa7-4ae4-a968-a586aac8deb0
X-Correlation-Id: qa-5be1da5c-dfc3-4b37-b6d8-0cd3e15afa2d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9f490b56ff64","subject":"Probe","message":"Hi"}

--- response: 503 in 33 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5be1da5c-dfc3-4b37-b6d8-0cd3e15afa2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-5be1da5c-dfc3-4b37-b6d8-0cd3e15afa2d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7a18255a-7401-449b-8317-21b0e6028884

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a18255a-7401-449b-8317-21b0e6028884
Content-Type: application/json

--- request body ---
{"handle":"qa-4e9ac5ea922e","password":"****"}

--- response: 200 in 80 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a18255a-7401-449b-8317-21b0e6028884
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_60104399-f681-4877-8c0a-56e0204269de"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a0051cac-53c8-4522-8bd3-cc103c87d799

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0051cac-53c8-4522-8bd3-cc103c87d799
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a0051cac-53c8-4522-8bd3-cc103c87d799
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
correlation: qa-7ded3ecf-4ce9-497b-abf9-67099f2ae54a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ded3ecf-4ce9-497b-abf9-67099f2ae54a
Content-Type: application/json

--- request body ---
{"handle":"qa-4e9ac5ea922e","password":"****"}

--- response: 401 in 31 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7ded3ecf-4ce9-497b-abf9-67099f2ae54a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7ded3ecf-4ce9-497b-abf9-67099f2ae54a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-abb18e25-9297-4d36-83ae-0e94e2e20a85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abb18e25-9297-4d36-83ae-0e94e2e20a85
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-abb18e25-9297-4d36-83ae-0e94e2e20a85
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
correlation: qa-7195ad89-6748-44c4-8bc2-16705362170b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7195ad89-6748-44c4-8bc2-16705362170b
Content-Type: application/json

--- request body ---
{"handle":"qa-9f490b56ff64","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7195ad89-6748-44c4-8bc2-16705362170b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7195ad89-6748-44c4-8bc2-16705362170b"}
```
