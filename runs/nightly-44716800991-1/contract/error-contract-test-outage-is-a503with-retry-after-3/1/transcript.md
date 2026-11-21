# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 58 | `qa-f4771c23-f573-4e92-9267-6423686cd424` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-d0515aa9-9b23-49a8-a1a7-0c3a831c0ccb` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-b72988c7-4d9c-4dc0-888e-6bea9e8d3569` |
| 4 | `POST /v1/conversations` | 201 | 31 | `qa-6c2c7d8d-ddff-4859-8d85-278fdaa753d0` |
| 5 | `PATCH /v1/accounts/me` | 503 | 20 | `qa-727a024e-3155-402e-a42d-51e7559ae280` |
| 6 | `POST /v1/auth/token` | 200 | 64 | `qa-ed91df10-5c8d-4a1e-a523-d335cca0bc29` |
| 7 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-871cf074-9406-44bb-a388-cc0fc36c6ce5` |
| 8 | `POST /v1/auth/token` | 401 | 42 | `qa-579aa65d-50ab-443c-be11-843dc201d4fe` |
| 9 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-ca0e5657-61b1-4f68-9b53-c288ae95aa29` |
| 10 | `POST /v1/auth/token` | 401 | 59 | `qa-4f93e156-2235-4802-89cb-e7d60c2eaf9a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f4771c23-f573-4e92-9267-6423686cd424

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4771c23-f573-4e92-9267-6423686cd424
Content-Type: application/json

--- request body ---
{"handle":"qa-2364d782a47f","displayName":"QA 2364d782a47f","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4771c23-f573-4e92-9267-6423686cd424
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Location: /v1/accounts/qa-2364d782a47f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_704a238c-dcb4-4b5c-9ff4-d43dce98eb6a","handle":"qa-2364d782a47f","displayName":"QA 2364d782a47f","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.414202031Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d0515aa9-9b23-49a8-a1a7-0c3a831c0ccb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0515aa9-9b23-49a8-a1a7-0c3a831c0ccb
Content-Type: application/json

--- request body ---
{"handle":"qa-f142a25979eb","displayName":"QA f142a25979eb","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0515aa9-9b23-49a8-a1a7-0c3a831c0ccb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Location: /v1/accounts/qa-f142a25979eb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8a74722a-c76b-4d6b-ba16-33dc2d57984e","handle":"qa-f142a25979eb","displayName":"QA f142a25979eb","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.465924510Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b72988c7-4d9c-4dc0-888e-6bea9e8d3569

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b72988c7-4d9c-4dc0-888e-6bea9e8d3569
Content-Type: application/json

--- request body ---
{"handle":"qa-2364d782a47f","password":"****"}

--- response: 200 in 23 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-b72988c7-4d9c-4dc0-888e-6bea9e8d3569
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_704a238c-dcb4-4b5c-9ff4-d43dce98eb6a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6c2c7d8d-ddff-4859-8d85-278fdaa753d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c2c7d8d-ddff-4859-8d85-278fdaa753d0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f142a25979eb","subject":"Error contract","message":"Hi"}

--- response: 201 in 31 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c2c7d8d-ddff-4859-8d85-278fdaa753d0
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
Location: /v1/conversations/cnv_9655b69d-db72-4ee7-813f-8d8fe57acb00
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9655b69d-db72-4ee7-813f-8d8fe57acb00","subject":"Error contract","status":"open","region":"eu","participants":["qa-2364d782a47f","qa-f142a25979eb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:00.563024127Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-727a024e-3155-402e-a42d-51e7559ae280

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 963ed9a3-0d2b-49d1-89fb-e9014ef2537f
X-Correlation-Id: qa-727a024e-3155-402e-a42d-51e7559ae280
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 20 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-727a024e-3155-402e-a42d-51e7559ae280
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-727a024e-3155-402e-a42d-51e7559ae280"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ed91df10-5c8d-4a1e-a523-d335cca0bc29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed91df10-5c8d-4a1e-a523-d335cca0bc29
Content-Type: application/json

--- request body ---
{"handle":"qa-f142a25979eb","password":"****"}

--- response: 200 in 64 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed91df10-5c8d-4a1e-a523-d335cca0bc29
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8a74722a-c76b-4d6b-ba16-33dc2d57984e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-871cf074-9406-44bb-a388-cc0fc36c6ce5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-871cf074-9406-44bb-a388-cc0fc36c6ce5
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-871cf074-9406-44bb-a388-cc0fc36c6ce5
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
correlation: qa-579aa65d-50ab-443c-be11-843dc201d4fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-579aa65d-50ab-443c-be11-843dc201d4fe
Content-Type: application/json

--- request body ---
{"handle":"qa-f142a25979eb","password":"****"}

--- response: 401 in 42 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-579aa65d-50ab-443c-be11-843dc201d4fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-579aa65d-50ab-443c-be11-843dc201d4fe"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ca0e5657-61b1-4f68-9b53-c288ae95aa29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca0e5657-61b1-4f68-9b53-c288ae95aa29
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ca0e5657-61b1-4f68-9b53-c288ae95aa29
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
correlation: qa-4f93e156-2235-4802-89cb-e7d60c2eaf9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f93e156-2235-4802-89cb-e7d60c2eaf9a
Content-Type: application/json

--- request body ---
{"handle":"qa-2364d782a47f","password":"****"}

--- response: 401 in 59 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f93e156-2235-4802-89cb-e7d60c2eaf9a
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4f93e156-2235-4802-89cb-e7d60c2eaf9a"}
```
