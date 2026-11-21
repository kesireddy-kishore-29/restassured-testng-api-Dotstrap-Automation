# Transcript: Unknown conversations and handles are 404 problems

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#unknownResourcesAre404` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 311 | `qa-1ec8b817-0c5d-45d4-8395-bc52296e2590` |
| 2 | `POST /v1/auth/token` | 200 | 35 | `qa-964786f1-e364-4df5-9a4c-040c65e06d21` |
| 3 | `GET /v1/conversations/{id}` | 404 | 54 | `qa-e0110436-1ee8-427a-ad4e-3118d0f77af7` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 33 | `qa-311bad26-1c56-42ce-8482-b1d867a343ae` |
| 5 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-f92f4391-7624-46ed-b9ba-d867175b3240` |
| 6 | `POST /v1/auth/token` | 401 | 10 | `qa-c95aab53-1e80-459d-abb8-9cc70d43bff2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1ec8b817-0c5d-45d4-8395-bc52296e2590

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ec8b817-0c5d-45d4-8395-bc52296e2590
Content-Type: application/json

--- request body ---
{"handle":"qa-62898f04801d","displayName":"QA 62898f04801d","password":"****","region":"eu"}

--- response: 201 in 311 ms ---
Date: Fri, 20 Nov 2026 10:09:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ec8b817-0c5d-45d4-8395-bc52296e2590
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-62898f04801d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c854fef5-bdc6-4217-a053-320101f9e277","handle":"qa-62898f04801d","displayName":"QA 62898f04801d","region":"eu","role":"user","createdAt":"2026-11-20T10:09:51.771851902Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-964786f1-e364-4df5-9a4c-040c65e06d21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-964786f1-e364-4df5-9a4c-040c65e06d21
Content-Type: application/json

--- request body ---
{"handle":"qa-62898f04801d","password":"****"}

--- response: 200 in 35 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-964786f1-e364-4df5-9a4c-040c65e06d21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c854fef5-bdc6-4217-a053-320101f9e277"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-e0110436-1ee8-427a-ad4e-3118d0f77af7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0110436-1ee8-427a-ad4e-3118d0f77af7
Content-Type: application/json

--- response: 404 in 54 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e0110436-1ee8-427a-ad4e-3118d0f77af7
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-e0110436-1ee8-427a-ad4e-3118d0f77af7"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-311bad26-1c56-42ce-8482-b1d867a343ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-311bad26-1c56-42ce-8482-b1d867a343ae
Content-Type: application/json

--- response: 404 in 33 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-311bad26-1c56-42ce-8482-b1d867a343ae
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
Content-Length: 247

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-311bad26-1c56-42ce-8482-b1d867a343ae"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f92f4391-7624-46ed-b9ba-d867175b3240

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f92f4391-7624-46ed-b9ba-d867175b3240
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f92f4391-7624-46ed-b9ba-d867175b3240
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c95aab53-1e80-459d-abb8-9cc70d43bff2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c95aab53-1e80-459d-abb8-9cc70d43bff2
Content-Type: application/json

--- request body ---
{"handle":"qa-62898f04801d","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c95aab53-1e80-459d-abb8-9cc70d43bff2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c95aab53-1e80-459d-abb8-9cc70d43bff2"}
```
