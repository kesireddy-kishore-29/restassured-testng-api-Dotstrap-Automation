# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-c779a9a5-cc7f-4a2b-bf55-0d515bba31bb` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-39b0eaea-7d81-4f37-be13-0e28a9139ff2` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-287260c8-7e6c-4f43-84a2-f773dff4fe78` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-c21438e4-9e20-40fe-bdf5-8050781ffeff` |
| 5 | `POST /v1/conversations` | 400 | 14 | `qa-971edc01-5481-4c4e-9cba-70ada0d92792` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-0b7c81a5-1f19-4ce3-9aff-040ae208277e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-12f2ee51-ff14-44e3-816a-29ac1eff1997` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-0d0d501a-78c5-444c-9f7e-ce22e17a7632` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-0ec16b2a-e6d7-4923-a169-408bf53fc886` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-7a75d26e-7367-4206-8e08-015aaf07ca10` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c779a9a5-cc7f-4a2b-bf55-0d515bba31bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c779a9a5-cc7f-4a2b-bf55-0d515bba31bb
Content-Type: application/json

--- request body ---
{"handle":"qa-ecb23666ad2a","displayName":"QA ecb23666ad2a","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-c779a9a5-cc7f-4a2b-bf55-0d515bba31bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 8
Location: /v1/accounts/qa-ecb23666ad2a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8465e28d-c566-4c77-9e18-55010d7fb5ab","handle":"qa-ecb23666ad2a","displayName":"QA ecb23666ad2a","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.504259399Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-39b0eaea-7d81-4f37-be13-0e28a9139ff2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39b0eaea-7d81-4f37-be13-0e28a9139ff2
Content-Type: application/json

--- request body ---
{"handle":"qa-254b6b04e6ac","displayName":"QA 254b6b04e6ac","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-39b0eaea-7d81-4f37-be13-0e28a9139ff2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 8
Location: /v1/accounts/qa-254b6b04e6ac
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dd28090c-d5b6-4d18-b38a-ad280cae1424","handle":"qa-254b6b04e6ac","displayName":"QA 254b6b04e6ac","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.546365393Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-287260c8-7e6c-4f43-84a2-f773dff4fe78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-287260c8-7e6c-4f43-84a2-f773dff4fe78
Content-Type: application/json

--- request body ---
{"handle":"qa-ecb23666ad2a","password":"****"}

--- response: 200 in 37 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-287260c8-7e6c-4f43-84a2-f773dff4fe78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8465e28d-c566-4c77-9e18-55010d7fb5ab"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c21438e4-9e20-40fe-bdf5-8050781ffeff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c21438e4-9e20-40fe-bdf5-8050781ffeff
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-254b6b04e6ac","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-c21438e4-9e20-40fe-bdf5-8050781ffeff
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
Location: /v1/conversations/cnv_f85b6c98-639d-4cbb-87cc-e7de17527f2d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f85b6c98-639d-4cbb-87cc-e7de17527f2d","subject":"Error contract","status":"open","region":"eu","participants":["qa-ecb23666ad2a","qa-254b6b04e6ac"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:00.636812968Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-971edc01-5481-4c4e-9cba-70ada0d92792

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-971edc01-5481-4c4e-9cba-70ada0d92792
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 14 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-971edc01-5481-4c4e-9cba-70ada0d92792
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-971edc01-5481-4c4e-9cba-70ada0d92792"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0b7c81a5-1f19-4ce3-9aff-040ae208277e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b7c81a5-1f19-4ce3-9aff-040ae208277e
Content-Type: application/json

--- request body ---
{"handle":"qa-254b6b04e6ac","password":"****"}

--- response: 200 in 33 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b7c81a5-1f19-4ce3-9aff-040ae208277e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dd28090c-d5b6-4d18-b38a-ad280cae1424"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-12f2ee51-ff14-44e3-816a-29ac1eff1997

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12f2ee51-ff14-44e3-816a-29ac1eff1997
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-12f2ee51-ff14-44e3-816a-29ac1eff1997
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
correlation: qa-0d0d501a-78c5-444c-9f7e-ce22e17a7632

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d0d501a-78c5-444c-9f7e-ce22e17a7632
Content-Type: application/json

--- request body ---
{"handle":"qa-254b6b04e6ac","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0d0d501a-78c5-444c-9f7e-ce22e17a7632
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0d0d501a-78c5-444c-9f7e-ce22e17a7632"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0ec16b2a-e6d7-4923-a169-408bf53fc886

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ec16b2a-e6d7-4923-a169-408bf53fc886
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0ec16b2a-e6d7-4923-a169-408bf53fc886
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
correlation: qa-7a75d26e-7367-4206-8e08-015aaf07ca10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a75d26e-7367-4206-8e08-015aaf07ca10
Content-Type: application/json

--- request body ---
{"handle":"qa-ecb23666ad2a","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7a75d26e-7367-4206-8e08-015aaf07ca10
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7a75d26e-7367-4206-8e08-015aaf07ca10"}
```
