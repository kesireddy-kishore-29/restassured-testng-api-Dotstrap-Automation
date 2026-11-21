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
| 1 | `POST /v1/accounts` | 201 | 387 | `qa-3f65fd70-17a9-44eb-ba65-7c83727434bd` |
| 2 | `POST /v1/accounts` | 201 | 49 | `qa-ec13a2d0-302d-4bc7-a667-e9c6e47eb5ce` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-5cda8956-86a2-41de-b4cb-7f9ac946596e` |
| 4 | `POST /v1/auth/token` | 200 | 25 | `qa-a6746ddb-ff1e-42cc-ae98-db53cf11cb16` |
| 5 | `GET /v1/accounts/me` | 200 | 30 | `qa-0c48872d-a7aa-46b1-9f56-58bdeb6da447` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 33 | `qa-ba11af31-ed17-4eaf-b041-a85f5a2caa03` |
| 7 | `POST /v1/auth/token` | 200 | 30 | `qa-ec43fb2c-6d56-457b-849f-86cd81e0fcdd` |
| 8 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-112135d0-a0b4-4377-83d6-26f721bf9a46` |
| 9 | `POST /v1/auth/token` | 401 | 11 | `qa-e7dbc1c6-7afd-4cbd-ae45-4906002ce553` |
| 10 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-38deb950-1110-4157-8191-a3f6360a5196` |
| 11 | `POST /v1/auth/token` | 401 | 14 | `qa-25d57387-5861-42ce-98c1-efbda201083d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3f65fd70-17a9-44eb-ba65-7c83727434bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f65fd70-17a9-44eb-ba65-7c83727434bd
Content-Type: application/json

--- request body ---
{"handle":"qa-da36e1231d07","displayName":"QA da36e1231d07","password":"****","region":"eu"}

--- response: 201 in 387 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f65fd70-17a9-44eb-ba65-7c83727434bd
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
Location: /v1/accounts/qa-da36e1231d07
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7e053260-c7ea-4c4b-a56e-0f92969f20e7","handle":"qa-da36e1231d07","displayName":"QA da36e1231d07","region":"eu","role":"user","createdAt":"2026-11-17T10:50:21.129598725Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ec13a2d0-302d-4bc7-a667-e9c6e47eb5ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec13a2d0-302d-4bc7-a667-e9c6e47eb5ce
Content-Type: application/json

--- request body ---
{"handle":"qa-bf645f739a62","displayName":"QA bf645f739a62","password":"****","region":"us"}

--- response: 201 in 49 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec13a2d0-302d-4bc7-a667-e9c6e47eb5ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-bf645f739a62
X-Served-Region: us
Content-Length: 181

{"id":"acc_840c8fbb-29b8-4b60-98a4-c1fe2db21e2d","handle":"qa-bf645f739a62","displayName":"QA bf645f739a62","region":"us","role":"user","createdAt":"2026-11-17T10:50:21.535508340Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5cda8956-86a2-41de-b4cb-7f9ac946596e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cda8956-86a2-41de-b4cb-7f9ac946596e
Content-Type: application/json

--- request body ---
{"handle":"qa-da36e1231d07","password":"****"}

--- response: 200 in 28 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-5cda8956-86a2-41de-b4cb-7f9ac946596e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7e053260-c7ea-4c4b-a56e-0f92969f20e7"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-a6746ddb-ff1e-42cc-ae98-db53cf11cb16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6746ddb-ff1e-42cc-ae98-db53cf11cb16
Content-Type: application/json

--- request body ---
{"handle":"qa-da36e1231d07","password":"****"}

--- response: 200 in 25 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6746ddb-ff1e-42cc-ae98-db53cf11cb16
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7e053260-c7ea-4c4b-a56e-0f92969f20e7"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-0c48872d-a7aa-46b1-9f56-58bdeb6da447

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c48872d-a7aa-46b1-9f56-58bdeb6da447
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c48872d-a7aa-46b1-9f56-58bdeb6da447
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

{"id":"acc_7e053260-c7ea-4c4b-a56e-0f92969f20e7","handle":"qa-da36e1231d07","displayName":"QA da36e1231d07","region":"eu","role":"user","createdAt":"2026-11-17T10:50:21.129598725Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-bf645f739a62
correlation: qa-ba11af31-ed17-4eaf-b041-a85f5a2caa03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba11af31-ed17-4eaf-b041-a85f5a2caa03
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba11af31-ed17-4eaf-b041-a85f5a2caa03
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

{"handle":"qa-bf645f739a62","displayName":"QA bf645f739a62","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-ec43fb2c-6d56-457b-849f-86cd81e0fcdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec43fb2c-6d56-457b-849f-86cd81e0fcdd
Content-Type: application/json

--- request body ---
{"handle":"qa-bf645f739a62","password":"****"}

--- response: 200 in 30 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec43fb2c-6d56-457b-849f-86cd81e0fcdd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_840c8fbb-29b8-4b60-98a4-c1fe2db21e2d"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-112135d0-a0b4-4377-83d6-26f721bf9a46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-112135d0-a0b4-4377-83d6-26f721bf9a46
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-112135d0-a0b4-4377-83d6-26f721bf9a46
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
correlation: qa-e7dbc1c6-7afd-4cbd-ae45-4906002ce553

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7dbc1c6-7afd-4cbd-ae45-4906002ce553
Content-Type: application/json

--- request body ---
{"handle":"qa-bf645f739a62","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e7dbc1c6-7afd-4cbd-ae45-4906002ce553
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e7dbc1c6-7afd-4cbd-ae45-4906002ce553"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-38deb950-1110-4157-8191-a3f6360a5196

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38deb950-1110-4157-8191-a3f6360a5196
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-38deb950-1110-4157-8191-a3f6360a5196
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
correlation: qa-25d57387-5861-42ce-98c1-efbda201083d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25d57387-5861-42ce-98c1-efbda201083d
Content-Type: application/json

--- request body ---
{"handle":"qa-da36e1231d07","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-25d57387-5861-42ce-98c1-efbda201083d
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-25d57387-5861-42ce-98c1-efbda201083d"}
```
