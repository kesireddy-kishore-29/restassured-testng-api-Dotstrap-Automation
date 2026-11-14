# Transcript: A new account can sign in and read itself back

| | |
|---|---|
| Test | `com.qaautomation.tests.smoke.HealthSmokeTest#newAccountCanSignInAndReadItself` |
| Features | FEAT-ACCT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 348 | `qa-eb95eb8f-7402-48c5-8bdd-928b29d90b96` |
| 2 | `POST /v1/auth/token` | 200 | 39 | `qa-7b8c71ea-c1f5-4f6c-a667-ae5283060043` |
| 3 | `GET /v1/accounts/me` | 200 | 38 | `qa-7f389200-984f-4312-aa54-f09da68b5b99` |
| 4 | `GET /v1/accounts/me` | 200 | 17 | `qa-43cb1015-9390-40f2-ae7c-2e4d8aa275a4` |
| 5 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-842cb228-13e2-4f99-8ad3-d9d3d06e98b8` |
| 6 | `POST /v1/auth/token` | 401 | 15 | `qa-13179637-81f3-43d8-abab-20eef6cd9adc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-eb95eb8f-7402-48c5-8bdd-928b29d90b96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb95eb8f-7402-48c5-8bdd-928b29d90b96
Content-Type: application/json

--- request body ---
{"handle":"qa-cbde77d61072","displayName":"QA cbde77d61072","password":"****","region":"eu"}

--- response: 201 in 348 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb95eb8f-7402-48c5-8bdd-928b29d90b96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-cbde77d61072
X-Served-Region: eu
Content-Length: 181

{"id":"acc_45a34478-ab00-478e-89df-147cb9deeba6","handle":"qa-cbde77d61072","displayName":"QA cbde77d61072","region":"eu","role":"user","createdAt":"2026-11-08T09:09:04.159368394Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7b8c71ea-c1f5-4f6c-a667-ae5283060043

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b8c71ea-c1f5-4f6c-a667-ae5283060043
Content-Type: application/json

--- request body ---
{"handle":"qa-cbde77d61072","password":"****"}

--- response: 200 in 39 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b8c71ea-c1f5-4f6c-a667-ae5283060043
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_45a34478-ab00-478e-89df-147cb9deeba6"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-7f389200-984f-4312-aa54-f09da68b5b99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f389200-984f-4312-aa54-f09da68b5b99
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f389200-984f-4312-aa54-f09da68b5b99
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
Content-Length: 181

{"id":"acc_45a34478-ab00-478e-89df-147cb9deeba6","handle":"qa-cbde77d61072","displayName":"QA cbde77d61072","region":"eu","role":"user","createdAt":"2026-11-08T09:09:04.159368394Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-43cb1015-9390-40f2-ae7c-2e4d8aa275a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43cb1015-9390-40f2-ae7c-2e4d8aa275a4
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-43cb1015-9390-40f2-ae7c-2e4d8aa275a4
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
Content-Length: 181

{"id":"acc_45a34478-ab00-478e-89df-147cb9deeba6","handle":"qa-cbde77d61072","displayName":"QA cbde77d61072","region":"eu","role":"user","createdAt":"2026-11-08T09:09:04.159368394Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-842cb228-13e2-4f99-8ad3-d9d3d06e98b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-842cb228-13e2-4f99-8ad3-d9d3d06e98b8
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-842cb228-13e2-4f99-8ad3-d9d3d06e98b8
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
correlation: qa-13179637-81f3-43d8-abab-20eef6cd9adc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13179637-81f3-43d8-abab-20eef6cd9adc
Content-Type: application/json

--- request body ---
{"handle":"qa-cbde77d61072","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-13179637-81f3-43d8-abab-20eef6cd9adc
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-13179637-81f3-43d8-abab-20eef6cd9adc"}
```
