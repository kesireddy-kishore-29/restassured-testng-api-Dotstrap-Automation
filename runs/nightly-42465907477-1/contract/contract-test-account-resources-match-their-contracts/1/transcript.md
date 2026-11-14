# Transcript: Account, token and public profile match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#accountResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01, FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 351 | `qa-dbfbf4a0-4b35-4e4c-a563-a515f6dd8240` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-50ae74c6-334c-429f-886f-5889548ea2cc` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-df6bbc46-5bae-46c0-9d1c-84aa50e5073b` |
| 4 | `POST /v1/auth/token` | 200 | 25 | `qa-19a4c0d1-c745-4276-90a7-ea25c9720dd7` |
| 5 | `GET /v1/accounts/me` | 200 | 9 | `qa-13351d16-73b2-462c-a844-f892479b31c5` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 31 | `qa-783e6ec6-4bd1-4206-bd9e-fbd4883ec590` |
| 7 | `POST /v1/auth/token` | 200 | 21 | `qa-9534a66b-4751-4b4e-8c4c-b18cc8af71a3` |
| 8 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-d4d78ee7-7e54-4d9a-9b7b-dc85fe334f9e` |
| 9 | `POST /v1/auth/token` | 401 | 8 | `qa-29473a58-06f8-4700-ae3c-28d20de8ddab` |
| 10 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-a7a77487-cd3f-439f-a0dc-d618788f3dee` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-e3c88af8-4b5d-4dd1-a795-6e7f24173a7a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dbfbf4a0-4b35-4e4c-a563-a515f6dd8240

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbfbf4a0-4b35-4e4c-a563-a515f6dd8240
Content-Type: application/json

--- request body ---
{"handle":"qa-329a9617362f","displayName":"QA 329a9617362f","password":"****","region":"eu"}

--- response: 201 in 351 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbfbf4a0-4b35-4e4c-a563-a515f6dd8240
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-329a9617362f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5e087276-0cda-4567-be4c-89df594f7ce9","handle":"qa-329a9617362f","displayName":"QA 329a9617362f","region":"eu","role":"user","createdAt":"2026-11-08T09:09:04.159618807Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-50ae74c6-334c-429f-886f-5889548ea2cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50ae74c6-334c-429f-886f-5889548ea2cc
Content-Type: application/json

--- request body ---
{"handle":"qa-ea10a3e69f22","displayName":"QA ea10a3e69f22","password":"****","region":"us"}

--- response: 201 in 36 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-50ae74c6-334c-429f-886f-5889548ea2cc
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
Location: /v1/accounts/qa-ea10a3e69f22
X-Served-Region: us
Content-Length: 181

{"id":"acc_c0533c17-53a4-439f-a529-18079b80e18a","handle":"qa-ea10a3e69f22","displayName":"QA ea10a3e69f22","region":"us","role":"user","createdAt":"2026-11-08T09:09:04.477463792Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-df6bbc46-5bae-46c0-9d1c-84aa50e5073b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df6bbc46-5bae-46c0-9d1c-84aa50e5073b
Content-Type: application/json

--- request body ---
{"handle":"qa-329a9617362f","password":"****"}

--- response: 200 in 29 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-df6bbc46-5bae-46c0-9d1c-84aa50e5073b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5e087276-0cda-4567-be4c-89df594f7ce9"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-19a4c0d1-c745-4276-90a7-ea25c9720dd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19a4c0d1-c745-4276-90a7-ea25c9720dd7
Content-Type: application/json

--- request body ---
{"handle":"qa-329a9617362f","password":"****"}

--- response: 200 in 25 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-19a4c0d1-c745-4276-90a7-ea25c9720dd7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5e087276-0cda-4567-be4c-89df594f7ce9"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-13351d16-73b2-462c-a844-f892479b31c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13351d16-73b2-462c-a844-f892479b31c5
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-13351d16-73b2-462c-a844-f892479b31c5
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

{"id":"acc_5e087276-0cda-4567-be4c-89df594f7ce9","handle":"qa-329a9617362f","displayName":"QA 329a9617362f","region":"eu","role":"user","createdAt":"2026-11-08T09:09:04.159618807Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-ea10a3e69f22
correlation: qa-783e6ec6-4bd1-4206-bd9e-fbd4883ec590

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-783e6ec6-4bd1-4206-bd9e-fbd4883ec590
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-783e6ec6-4bd1-4206-bd9e-fbd4883ec590
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

{"handle":"qa-ea10a3e69f22","displayName":"QA ea10a3e69f22","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-9534a66b-4751-4b4e-8c4c-b18cc8af71a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9534a66b-4751-4b4e-8c4c-b18cc8af71a3
Content-Type: application/json

--- request body ---
{"handle":"qa-ea10a3e69f22","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-9534a66b-4751-4b4e-8c4c-b18cc8af71a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c0533c17-53a4-439f-a529-18079b80e18a"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d4d78ee7-7e54-4d9a-9b7b-dc85fe334f9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4d78ee7-7e54-4d9a-9b7b-dc85fe334f9e
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d4d78ee7-7e54-4d9a-9b7b-dc85fe334f9e
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
correlation: qa-29473a58-06f8-4700-ae3c-28d20de8ddab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29473a58-06f8-4700-ae3c-28d20de8ddab
Content-Type: application/json

--- request body ---
{"handle":"qa-ea10a3e69f22","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-29473a58-06f8-4700-ae3c-28d20de8ddab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-29473a58-06f8-4700-ae3c-28d20de8ddab"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a7a77487-cd3f-439f-a0dc-d618788f3dee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7a77487-cd3f-439f-a0dc-d618788f3dee
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a7a77487-cd3f-439f-a0dc-d618788f3dee
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-e3c88af8-4b5d-4dd1-a795-6e7f24173a7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3c88af8-4b5d-4dd1-a795-6e7f24173a7a
Content-Type: application/json

--- request body ---
{"handle":"qa-329a9617362f","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e3c88af8-4b5d-4dd1-a795-6e7f24173a7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e3c88af8-4b5d-4dd1-a795-6e7f24173a7a"}
```
