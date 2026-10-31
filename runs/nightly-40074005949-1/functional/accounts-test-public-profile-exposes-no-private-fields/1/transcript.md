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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-1c38ec99-7bdb-4502-bd49-001f8a5d7f6a` |
| 2 | `POST /v1/accounts` | 201 | 8 | `qa-31333cba-9904-4750-bec4-c351226e1505` |
| 3 | `POST /v1/auth/token` | 200 | 12 | `qa-911acd16-7c63-43db-a1f6-e1d94453b772` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 8 | `qa-37242199-19c4-45ed-9672-8a45e0301077` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 13 | `qa-cc9e4731-4ca8-41ad-adec-e3668f56fb44` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 12 | `qa-bad725a4-0609-49d6-b5f8-8cd9548e1e4f` |
| 7 | `POST /v1/auth/token` | 200 | 14 | `qa-4ddd41d2-1404-41e3-8401-35155e127e94` |
| 8 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-dcf28f7b-955c-44eb-a454-b703e332473e` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-8341a70e-8d0b-437e-bb82-99b11b8f61e9` |
| 10 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-4994b51a-8d9e-46f1-a018-aa520f561de0` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-56224aa8-f645-4e30-8edc-417a57e7213f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1c38ec99-7bdb-4502-bd49-001f8a5d7f6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c38ec99-7bdb-4502-bd49-001f8a5d7f6a
Content-Type: application/json

--- request body ---
{"handle":"qa-f6d886d0d2a1","displayName":"QA f6d886d0d2a1","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c38ec99-7bdb-4502-bd49-001f8a5d7f6a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-f6d886d0d2a1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b3efe25c-696d-4afd-842a-cc934f5615c9","handle":"qa-f6d886d0d2a1","displayName":"QA f6d886d0d2a1","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.143729935Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-31333cba-9904-4750-bec4-c351226e1505

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31333cba-9904-4750-bec4-c351226e1505
Content-Type: application/json

--- request body ---
{"handle":"qa-cc5790cbb732","displayName":"QA cc5790cbb732","password":"****","region":"us"}

--- response: 201 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-31333cba-9904-4750-bec4-c351226e1505
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
Location: /v1/accounts/qa-cc5790cbb732
X-Served-Region: us
Content-Length: 181

{"id":"acc_6ac8e337-1dd6-42b7-987e-fec0297c2cef","handle":"qa-cc5790cbb732","displayName":"QA cc5790cbb732","region":"us","role":"user","createdAt":"2026-10-24T07:25:03.158172529Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-911acd16-7c63-43db-a1f6-e1d94453b772

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-911acd16-7c63-43db-a1f6-e1d94453b772
Content-Type: application/json

--- request body ---
{"handle":"qa-f6d886d0d2a1","password":"****"}

--- response: 200 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-911acd16-7c63-43db-a1f6-e1d94453b772
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b3efe25c-696d-4afd-842a-cc934f5615c9"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-cc5790cbb732
correlation: qa-37242199-19c4-45ed-9672-8a45e0301077

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37242199-19c4-45ed-9672-8a45e0301077
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-37242199-19c4-45ed-9672-8a45e0301077
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

{"handle":"qa-cc5790cbb732","displayName":"QA cc5790cbb732","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-cc5790cbb732
correlation: qa-cc9e4731-4ca8-41ad-adec-e3668f56fb44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc9e4731-4ca8-41ad-adec-e3668f56fb44
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc9e4731-4ca8-41ad-adec-e3668f56fb44
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

{"handle":"qa-cc5790cbb732","displayName":"QA cc5790cbb732","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-cc5790cbb732
correlation: qa-bad725a4-0609-49d6-b5f8-8cd9548e1e4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bad725a4-0609-49d6-b5f8-8cd9548e1e4f
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-bad725a4-0609-49d6-b5f8-8cd9548e1e4f
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

{"handle":"qa-cc5790cbb732","displayName":"QA cc5790cbb732","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-4ddd41d2-1404-41e3-8401-35155e127e94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ddd41d2-1404-41e3-8401-35155e127e94
Content-Type: application/json

--- request body ---
{"handle":"qa-cc5790cbb732","password":"****"}

--- response: 200 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ddd41d2-1404-41e3-8401-35155e127e94
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6ac8e337-1dd6-42b7-987e-fec0297c2cef"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dcf28f7b-955c-44eb-a454-b703e332473e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcf28f7b-955c-44eb-a454-b703e332473e
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dcf28f7b-955c-44eb-a454-b703e332473e
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
correlation: qa-8341a70e-8d0b-437e-bb82-99b11b8f61e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8341a70e-8d0b-437e-bb82-99b11b8f61e9
Content-Type: application/json

--- request body ---
{"handle":"qa-cc5790cbb732","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8341a70e-8d0b-437e-bb82-99b11b8f61e9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8341a70e-8d0b-437e-bb82-99b11b8f61e9"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4994b51a-8d9e-46f1-a018-aa520f561de0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4994b51a-8d9e-46f1-a018-aa520f561de0
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4994b51a-8d9e-46f1-a018-aa520f561de0
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
correlation: qa-56224aa8-f645-4e30-8edc-417a57e7213f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56224aa8-f645-4e30-8edc-417a57e7213f
Content-Type: application/json

--- request body ---
{"handle":"qa-f6d886d0d2a1","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-56224aa8-f645-4e30-8edc-417a57e7213f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-56224aa8-f645-4e30-8edc-417a57e7213f"}
```
