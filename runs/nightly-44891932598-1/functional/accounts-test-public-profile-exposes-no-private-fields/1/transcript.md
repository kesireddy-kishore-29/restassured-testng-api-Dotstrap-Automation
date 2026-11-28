# Transcript: Anyone signed in sees a public profile with no private fields

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#publicProfileExposesNoPrivateFields` |
| Features | FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-9bc0e75b-44dc-477e-b28e-67210760ca55` |
| 2 | `POST /v1/accounts` | 201 | 13 | `qa-40878739-d40c-4849-8c1a-6bd0fd2c16c6` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-3e74e0dd-f9f3-4f58-9a86-35e9ebb2174c` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 14 | `qa-dc574865-11df-4eee-bb80-bfdceb1bbce3` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 20 | `qa-4519af2a-9892-4312-b7e4-1d5c85af32b6` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 7 | `qa-2f25fcb2-d951-4351-8d44-82025256eebc` |
| 7 | `POST /v1/auth/token` | 200 | 15 | `qa-4c265765-7b01-4f4f-a546-66dcd8d40c95` |
| 8 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-ffdeaac3-e3f0-4698-b319-b277fc438ec9` |
| 9 | `POST /v1/auth/token` | 401 | 15 | `qa-12120c72-65e5-4845-aca8-2b0507900677` |
| 10 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-9469bb34-e12f-4950-b6ef-c9e8dc721384` |
| 11 | `POST /v1/auth/token` | 401 | 9 | `qa-4f77918d-c3bd-4503-bb0e-19eb03291055` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9bc0e75b-44dc-477e-b28e-67210760ca55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bc0e75b-44dc-477e-b28e-67210760ca55
Content-Type: application/json

--- request body ---
{"handle":"qa-37efa5138043","displayName":"QA 37efa5138043","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bc0e75b-44dc-477e-b28e-67210760ca55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Location: /v1/accounts/qa-37efa5138043
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6abf9bd7-9257-4e01-abb1-f4c62cd1a98a","handle":"qa-37efa5138043","displayName":"QA 37efa5138043","region":"eu","role":"user","createdAt":"2026-11-21T09:57:10.275618032Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-40878739-d40c-4849-8c1a-6bd0fd2c16c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40878739-d40c-4849-8c1a-6bd0fd2c16c6
Content-Type: application/json

--- request body ---
{"handle":"qa-c68eaba4ee3e","displayName":"QA c68eaba4ee3e","password":"****","region":"us"}

--- response: 201 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-40878739-d40c-4849-8c1a-6bd0fd2c16c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-c68eaba4ee3e
X-Served-Region: us
Content-Length: 181

{"id":"acc_491a55db-1f81-4a31-be24-d8d7af98487e","handle":"qa-c68eaba4ee3e","displayName":"QA c68eaba4ee3e","region":"us","role":"user","createdAt":"2026-11-21T09:57:10.296496276Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3e74e0dd-f9f3-4f58-9a86-35e9ebb2174c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e74e0dd-f9f3-4f58-9a86-35e9ebb2174c
Content-Type: application/json

--- request body ---
{"handle":"qa-37efa5138043","password":"****"}

--- response: 200 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e74e0dd-f9f3-4f58-9a86-35e9ebb2174c
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6abf9bd7-9257-4e01-abb1-f4c62cd1a98a"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-c68eaba4ee3e
correlation: qa-dc574865-11df-4eee-bb80-bfdceb1bbce3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc574865-11df-4eee-bb80-bfdceb1bbce3
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc574865-11df-4eee-bb80-bfdceb1bbce3
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
Content-Length: 74

{"handle":"qa-c68eaba4ee3e","displayName":"QA c68eaba4ee3e","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-c68eaba4ee3e
correlation: qa-4519af2a-9892-4312-b7e4-1d5c85af32b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4519af2a-9892-4312-b7e4-1d5c85af32b6
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-4519af2a-9892-4312-b7e4-1d5c85af32b6
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
Content-Length: 74

{"handle":"qa-c68eaba4ee3e","displayName":"QA c68eaba4ee3e","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-c68eaba4ee3e
correlation: qa-2f25fcb2-d951-4351-8d44-82025256eebc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f25fcb2-d951-4351-8d44-82025256eebc
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f25fcb2-d951-4351-8d44-82025256eebc
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
Content-Length: 74

{"handle":"qa-c68eaba4ee3e","displayName":"QA c68eaba4ee3e","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-4c265765-7b01-4f4f-a546-66dcd8d40c95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c265765-7b01-4f4f-a546-66dcd8d40c95
Content-Type: application/json

--- request body ---
{"handle":"qa-c68eaba4ee3e","password":"****"}

--- response: 200 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c265765-7b01-4f4f-a546-66dcd8d40c95
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_491a55db-1f81-4a31-be24-d8d7af98487e"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ffdeaac3-e3f0-4698-b319-b277fc438ec9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffdeaac3-e3f0-4698-b319-b277fc438ec9
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ffdeaac3-e3f0-4698-b319-b277fc438ec9
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
X-Served-Region: us
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-12120c72-65e5-4845-aca8-2b0507900677

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12120c72-65e5-4845-aca8-2b0507900677
Content-Type: application/json

--- request body ---
{"handle":"qa-c68eaba4ee3e","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12120c72-65e5-4845-aca8-2b0507900677
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-12120c72-65e5-4845-aca8-2b0507900677"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9469bb34-e12f-4950-b6ef-c9e8dc721384

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9469bb34-e12f-4950-b6ef-c9e8dc721384
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9469bb34-e12f-4950-b6ef-c9e8dc721384
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-4f77918d-c3bd-4503-bb0e-19eb03291055

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f77918d-c3bd-4503-bb0e-19eb03291055
Content-Type: application/json

--- request body ---
{"handle":"qa-37efa5138043","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f77918d-c3bd-4503-bb0e-19eb03291055
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4f77918d-c3bd-4503-bb0e-19eb03291055"}
```
